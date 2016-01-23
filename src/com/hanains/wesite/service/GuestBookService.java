package com.hanains.wesite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanains.wesite.dao.GuestBookDao;
import com.hanains.wesite.vo.GuestBookVo;

@Service
public class GuestBookService {

	@Autowired
	private GuestBookDao guestBookDao;
	
	public void write(GuestBookVo vo){
		guestBookDao.insert(vo);
	}
	
	public void delete(GuestBookVo vo){
		guestBookDao.delete(vo);
	}
	
	public List<GuestBookVo> list(){
		List<GuestBookVo> list = guestBookDao.getList();
		return list;
	}
}
