package com.hanains.wesite.service.board.impl;

import org.springframework.stereotype.Service;

import com.hanains.wesite.service.board.BoardService;

@Service
public class BoardServiceImpl implements BoardService{

	public BoardServiceImpl() {
		System.out.println(this.getClass());
	}
	
}
