package com.kh.yseolc.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.yseolc.board.model.dao.BoardReplyDao;
import com.kh.yseolc.board.model.domain.BoardReply;

@Service("brService")
public class BoardReplyServiceImpl implements BoardReplyService {
	@Autowired
	private BoardReplyDao brDao;

	public BoardReply selectBoardReply(String comment_id) {
		return brDao.selectOne(comment_id);
	}

	public List<BoardReply> selectList(String board_num) {
		return brDao.selectList(board_num);
	}

	public int insertBoardReply(BoardReply br) {
		return brDao.insertBoardReply(br);
	}

	public int updateBoardReply(BoardReply br) {
		return brDao.updateBoardReply(br);
	}

	public int deleteBoardReply(BoardReply br) {
		return brDao.deleteBoardReply(br);
	}
}
