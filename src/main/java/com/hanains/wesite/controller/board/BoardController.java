package com.hanains.wesite.controller.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanains.wesite.service.board.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	public BoardController() {
		System.out.println(this.getClass());
	}
	
	@RequestMapping()
	public String getList(){
		
		return "";
	}
	
}
