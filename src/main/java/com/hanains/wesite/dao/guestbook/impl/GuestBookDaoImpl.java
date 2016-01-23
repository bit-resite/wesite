package com.hanains.wesite.dao.guestbook.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanains.wesite.dao.guestbook.GuestBookDao;
import com.hanains.wesite.domain.guestbook.GuestBook;

@Repository
public class GuestBookDaoImpl implements GuestBookDao{

	@Autowired
	private SqlSession sqlSession;
	
	public GuestBookDaoImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public List<GuestBook> getList() throws Exception {
		List<GuestBook> list = sqlSession.selectOne("guestbook.getList");
		return null;
	}

	@Override
	public void insert(GuestBook guestBook) throws Exception {
		sqlSession.insert("guestbook.insert", guestBook);
	}

	@Override
	public void delete(GuestBook guestBook) throws Exception {
		sqlSession.delete("guestbook.delete", guestBook);
	}
}
