package com.hanains.wesite.service.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanains.wesite.dao.board.BoardDao;
import com.hanains.wesite.domain.board.Board;
import com.hanains.wesite.service.board.BoardService;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDao boardDao;
	
	public BoardServiceImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public List<Board> getList() throws Exception {
		List<Board> list = boardDao.getList();
		return list;
	}
	
}
