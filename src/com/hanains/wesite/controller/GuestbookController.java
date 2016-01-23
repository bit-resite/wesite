package com.hanains.wesite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanains.wesite.service.GuestBookService;
import com.hanains.wesite.vo.GuestBookVo;

@Controller
public class GuestbookController {

	@Autowired
	private GuestBookService guestBookService;
	
	@RequestMapping("/")
	public String index(Model model){
		List<GuestBookVo> list = guestBookService.list();
		model.addAttribute("list", list);
		
		
		return "/WEB-INF/views/index.jsp";
	}
	
	
}
