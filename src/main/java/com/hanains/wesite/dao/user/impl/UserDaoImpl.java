package com.hanains.wesite.dao.user.impl;

import org.springframework.stereotype.Repository;

import com.hanains.wesite.dao.user.UserDao;

@Repository
public class UserDaoImpl implements UserDao{

	public UserDaoImpl() {
		System.out.println(this.getClass());
	}
	
}
