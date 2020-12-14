package com.kh.yseolc.board.model.domain;

import java.io.Serializable;
import java.sql.Date;

/* BOARD_NUM CHAR (10), 
 * BOARD_WRITER VARCHAR2(12) NOT NULL, 
 * BOARD_TITLE VARCHAR2(50) NOT NULL, 
 * READ_COUNT NUMBER(5，0) DEFAULT 0 NOT NULL, 
 * REGDATE DATE DEFAULT SYSDATE NOT NULL, 
 * BOARD_CONTENT VARCHAR2(4000) NOT NULL, 
 * BOARD_FILE VARCHAR2(500), 
 * BOARD_PWD VARCHAR2(100), 
 * CONSTRAINT BOARD_PK PRIMARY KEY (BOARD_NUM) );
 */

public class Board implements Serializable {
	private static final long serialVersionUID = 20001L;
	private String board_num;
	private String board_writer;
	private String board_title;
	private String board_content;
	private String board_file;
	private String board_pwd;
	private int read_count;
	private Date regdate;

	public Board() {
	}

	public Board(String board_num, String board_pwd) {
		super();
		this.board_num = board_num;
		this.board_pwd = board_pwd;
	}

	public Board(String board_writer, String board_title, String board_content, String board_file, String board_pwd) {
		super();
		this.board_writer = board_writer;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_file = board_file;
		this.board_pwd = board_pwd;
	}

	public Board(String board_num, String board_writer, String board_title, String board_content, String board_file,
			String board_pwd, int read_count, Date regdate) {
		super();
		this.board_num = board_num;
		this.board_writer = board_writer;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_file = board_file;
		this.board_pwd = board_pwd;
		this.read_count = read_count;
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Board [board_num=" + board_num + ", board_writer=" + board_writer + ", board_title=" + board_title
				+ ", board_content=" + board_content + ", board_file=" + board_file + ", board_pwd=" + board_pwd
				+ ", read_count=" + read_count + ", regdate=" + regdate + "]";
	}

	public String getBoard_num() {
		return board_num;
	}

	public void setBoard_num(String board_num) {
		this.board_num = board_num;
	}

	public String getBoard_writer() {
		return board_writer;
	}

	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public String getBoard_file() {
		return board_file;
	}

	public void setBoard_file(String board_file) {
		this.board_file = board_file;
	}

	public String getBoard_pwd() {
		return board_pwd;
	}

	public void setBoard_pwd(String board_pwd) {
		this.board_pwd = board_pwd;
	}

	public int getRead_count() {
		return read_count;
	}

	public void setRead_count(int read_count) {
		this.read_count = read_count;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
