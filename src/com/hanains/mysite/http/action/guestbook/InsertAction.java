package com.hanains.mysite.http.action.guestbook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.http.HttpUtil;
import com.hanains.http.action.Action;
import com.hanains.mysite.dao.GuestBookDao;
import com.hanains.mysite.vo.GuestBookVo;

public class InsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String password=request.getParameter("pass");
		String message=request.getParameter("content");
		
		GuestBookVo vo = new GuestBookVo();
		vo.setName(name);
		vo.setPassword(password);
		vo.setMessage(message);
		
		GuestBookDao dao = new GuestBookDao();
		dao.insert(vo);
		HttpUtil.redirect(response, "/mysite/guestbook?a=guestbook");
//		response.sendRedirect("/guestbook2/gb");
	}

}
