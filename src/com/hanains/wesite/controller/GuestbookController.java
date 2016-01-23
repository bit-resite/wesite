package com.hanains.wesite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanains.wesite.service.GuestBookService;
import com.hanains.wesite.vo.GuestBookVo;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {

	@Autowired
	private GuestBookService guestBookService;
	
	@RequestMapping("/")
	public String index(Model model){
		List<GuestBookVo> list = guestBookService.list();
		model.addAttribute("list", list);
		
		
		return "/guestbook/listsp";
	}
	
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute GuestBookVo vo) {
		
		if(vo.getMessage().trim().length()==0 ||vo.getName().trim().length()==0 || vo.getPassword().trim().length()==0){
			return "redirect:/guestbook?result=fail";
		}
		
		guestBookService.write(vo);
		return "redirect:/guestbook/";
		
	}
	
	@RequestMapping("/delete")
	public String delte(@ModelAttribute GuestBookVo vo){
		
		guestBookService.delete(vo);
		return "redirect:/guestbook/";
	}
	
	
}
