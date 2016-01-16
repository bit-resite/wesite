package com.hanains.mysite.http.action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hanains.http.HttpUtil;
import com.hanains.http.action.Action;
import com.hanains.mysite.dao.BoardDao;
import com.hanains.mysite.vo.BoardVo;
import com.hanains.mysite.vo.UserVo;


public class InsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		if( session == null ) {
			HttpUtil.redirect( response, "/mysite/main" );
			return;
		}
		
		
		UserVo memberVo = (UserVo)session.getAttribute( "authUser" );

		
		String title = request.getParameter( "title" );
		
		String content = request.getParameter( "content" );
		
		
		Long memberNo = memberVo.getNo();
		
		BoardVo vo = new BoardVo();
		vo.setTitle(title);
		vo.setContent( content );
		vo.setMemberNo( memberNo );

		BoardDao dao = new BoardDao();
		dao.insert(vo);

		HttpUtil.redirect( response, "/mysite/board" );
	}
}



