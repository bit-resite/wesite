package com.hanains.wesite.service.user;

import com.hanains.wesite.domain.user.User;

public interface UserService {

	public User login(User user) throws Exception;

	public void join(User user) throws Exception;
	
	

}
