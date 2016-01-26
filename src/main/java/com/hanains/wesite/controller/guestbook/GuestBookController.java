package com.hanains.wesite.controller.guestbook;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hanains.wesite.domain.guestbook.GuestBook;
import com.hanains.wesite.domain.user.User;
import com.hanains.wesite.service.guestbook.GuestBookService;

@Controller
@RequestMapping("/guestbook")
public class GuestBookController {
	
	@Autowired
	private GuestBookService guestBookService;

	public GuestBookController() {
		System.out.println(this.getClass());
	}
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request) throws Exception{
		System.out.println(guestBookService.getList());
		List<GuestBook> list =guestBookService.getList();
		
		request.setAttribute("list", list);
		
		return "/guestbook/list";
	}
	
	@RequestMapping("/insert")
	public String insert(
			@ModelAttribute("guestbook") GuestBook guestBook,
			@RequestParam("name") String name,
			@RequestParam("password") String password,
			@RequestParam("content") String content,
			HttpServletRequest request)throws Exception{

		System.out.println(name+"/"+password+"/"+content+"/"+request.getParameter("content"));
		
		guestBook.setName(name); guestBook.setPassword(password); guestBook.setMessage(content);
		System.out.println("insert = "+guestBook);
		guestBookService.insert(guestBook);
		
		return "redirect:/guestbook/list";
	}
	
	@RequestMapping("form")
	public String form(){
		return "/guestbook/deleteform";
	}
	
	@RequestMapping("delete")
	public String delete(HttpServletRequest request, @ModelAttribute GuestBook guestBook) throws Exception{
		
		System.out.println(request.getParameter("no"));
		
		guestBook.setPassword(request.getParameter("password"));
		
		guestBookService.delete(guestBook);
		
		return "redirect:/guestbook/list";
	}
	
}
