package com.hanains.wesite.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanains.wesite.dao.user.UserDao;
import com.hanains.wesite.domain.user.User;
import com.hanains.wesite.service.user.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public UserServiceImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public User login(User user) throws Exception {
		User Authuser = userDao.get(user.getEmail(), user.getPassword());
		return Authuser;
	}

	@Override
	public void join(User user) throws Exception {
		userDao.join(user);
	}
	
}
