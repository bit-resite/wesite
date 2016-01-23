package com.hanains.wesite.service.guestbook.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanains.wesite.dao.guestbook.GuestBookDao;
import com.hanains.wesite.domain.guestbook.GuestBook;
import com.hanains.wesite.service.guestbook.GuestBookService;

@Service
public class GuestBookServiceImpl implements GuestBookService{
	
	@Autowired
	private GuestBookDao dao;
	
	public GuestBookServiceImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public List<GuestBook> getList() throws Exception {
		List<GuestBook> list = dao.getList();
		return list;
	}

	@Override
	public void insert(GuestBook guestBook) throws Exception {
		dao.insert(guestBook);
	}

	@Override
	public void delete(GuestBook guestBook) throws Exception {
		dao.delete(guestBook);
	}
	
}
