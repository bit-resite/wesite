package com.hanains.wesite.dao.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanains.wesite.dao.board.BoardDao;
import com.hanains.wesite.domain.board.Board;

@Repository
public class BoardDaoImpl implements BoardDao{

	@Autowired
	private SqlSession sqlSession;
	
	public BoardDaoImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public List<Board> getList() throws Exception {
		List<Board> list = sqlSession.selectOne("board.getList");
		return list;
	}
}
