package com.kh.yseolc.board.model.service;

import java.util.List;

import com.kh.yseolc.board.model.domain.Board;

public interface BoardService {
	// 같은 패키지 내에 있기 때문에 앞에 public 붙여주지 않는 것이 컴팩트한 코드!
	int totalCount();

	Board selectBoard(int chk, String board_num);

	List<Board> selectList(int startPage, int limit);

	List<Board> selectSearch(String keyword);

	void insertBoard(Board b);

	Board updateBoard(Board b);

	void deleteBoard(String board_num);
}
