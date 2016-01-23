package com.hanains.wesite.controller.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanains.wesite.domain.board.Board;
import com.hanains.wesite.service.board.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	public BoardController() {
		System.out.println(this.getClass());
	}
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request) throws Exception{
		List<Board> list = boardService.getList();
		request.setAttribute("list", list);
		
		return "/board/list";
	}
	
	
}
