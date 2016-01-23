package com.hanains.wesite.service.guestbook;

import java.util.List;

import com.hanains.wesite.domain.guestbook.GuestBook;

public interface GuestBookService {
	
	public List<GuestBook> getList() throws Exception;
	
	public void insert(GuestBook guestBook) throws Exception;
	
	public void delete(GuestBook guestBook) throws Exception;
	
}
