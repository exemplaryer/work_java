package com.koitt.java.board.dao;

import java.util.ArrayList;
import java.util.List;

import com.koitt.java.board.model.Board;

public class BoardDao {
	
	// 데이터베이스 대신 게시글을 저장하는 용도로 사용
	private List<Board> list;
	
	public BoardDao() {
		this.list = new ArrayList<Board>();
	}
	
	public void insert(Board board) {
		list.add(board);
	}
	
	// 1.
	public List<Board> selectAll() {
		return this.list;
	}
	
	// 1.
	public void delete(Board board) {
		for (int i = 0; i < this.list.size(); i++) {
			if (this.list.get(i).equals(board)) {
				this.list.remove(this.list.get(i));
				return;
			}
		}
	}
}
