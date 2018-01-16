package com.koitt.java.board.service;

import java.util.Date;

import com.koitt.java.board.dao.BoardDao;
import com.koitt.java.board.model.Board;

public class BoardService {
	
	private BoardDao dao;
	private Integer count;	// 기본값이 null 이기 때문에 생성자에서 0으로 초기화해야 한다.
	
	public BoardService() {
		this.dao = new BoardDao();
		this.count = 0;	// 0으로 초기화
	}
	
	public void add(Board board) {
		board.setId(++this.count);		// null값이었던 id값을 채워준다.
		board.setRegDate(new Date());	// new Date() 하는 순간의 시간이 저장된다.
		this.dao.insert(board);			// 자료구조(ArrayList)에 저장하기 위해 dao로 board 객체를 전달
	}
}
