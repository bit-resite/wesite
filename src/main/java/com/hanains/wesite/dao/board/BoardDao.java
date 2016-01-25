package com.hanains.wesite.dao.board;

import java.util.List;

import com.hanains.wesite.domain.board.Board;

public interface BoardDao {

	public List<Board> getList() throws Exception;

}
