package com.hanains.wesite.dao.user;

import com.hanains.wesite.domain.user.User;

public interface UserDao {

	public void join(User user) throws Exception;
	
	public User get(String email, String password) throws Exception;

}
