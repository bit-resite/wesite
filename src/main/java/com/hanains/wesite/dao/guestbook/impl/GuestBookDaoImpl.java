package com.hanains.wesite.dao.guestbook.impl;

import org.springframework.stereotype.Repository;

import com.hanains.wesite.dao.guestbook.GuestBookDao;

@Repository
public class GuestBookDaoImpl implements GuestBookDao{

	public GuestBookDaoImpl() {
		System.out.println(this.getClass());
	}
}
