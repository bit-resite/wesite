package com.hanains.wesite.service.guestbook.impl;

import org.springframework.stereotype.Service;

import com.hanains.wesite.service.guestbook.GuestBookService;

@Service
public class GuestBookServiceImpl implements GuestBookService{
	
	public GuestBookServiceImpl() {
		System.out.println(this.getClass());
	}
	
}
