package com.koitt.java.board.service;

import com.koitt.java.board.dao.BoardDao;
import com.koitt.java.board.model.Board;

public class BoardService {
	
	private BoardDao dao;
	
	public BoardService() {
		this.dao = new BoardDao();
	}
	
	public void add(Board board) {
		this.dao.insert(board);
	}
}
