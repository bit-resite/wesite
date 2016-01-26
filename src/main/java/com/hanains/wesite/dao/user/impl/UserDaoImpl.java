package com.hanains.wesite.dao.user.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanains.wesite.dao.user.UserDao;
import com.hanains.wesite.domain.user.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SqlSession sqlSession;
	
	public UserDaoImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public void join(User user) throws Exception {
		sqlSession.insert("user.insert", user);
	}

	@Override
	public User get(String email, String password) throws Exception {
		Map<String, Object> map = new ConcurrentHashMap<>();
		map.put("email", email);
		map.put("password", password);
		
		User user = sqlSession.selectOne("user.getbyEmailAndPassword", map);
		
		return user;
	}
	
}
