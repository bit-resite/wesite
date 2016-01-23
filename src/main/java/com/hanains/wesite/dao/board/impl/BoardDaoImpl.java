package com.hanains.wesite.dao.board.impl;

import org.springframework.stereotype.Repository;

import com.hanains.wesite.dao.board.BoardDao;

@Repository
public class BoardDaoImpl implements BoardDao{

	public BoardDaoImpl() {
		System.out.println(this.getClass());
	}
}
