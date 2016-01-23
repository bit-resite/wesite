package com.hanains.wesite.controller.guestbook;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanains.wesite.domain.guestbook.GuestBook;
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
		List<GuestBook> list =guestBookService.getList();
		
		request.setAttribute("list", list);
		
		return "/guestbook/list";
	}
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute GuestBook guestBook, HttpServletRequest request)throws Exception{
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String content=request.getParameter("content");
		
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
		
		System.out.println("deleteC:"+guestBook);
		
		guestBookService.delete(guestBook);
		
		return "redirect:/guestbook/list";
	}
	
}
