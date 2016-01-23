package com.hanains.wesite.service.user.impl;

import org.springframework.stereotype.Service;

import com.hanains.wesite.service.user.UserService;


@Service
public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
		System.out.println(this.getClass());
	}
	
}
