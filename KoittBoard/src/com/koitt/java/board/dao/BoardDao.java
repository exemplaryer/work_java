package com.koitt.java.board.dao;

import java.util.ArrayList;
import java.util.List;

import com.koitt.java.board.exception.BoardException;
import com.koitt.java.board.model.Board;

public class BoardDao {
	
	// 데이터베이스 대신 게시글을 저장하는 용도로 사용
	private List<Board> list;
	
	public BoardDao() {
		this.list = new ArrayList<Board>();
	}
	
									// 2.
	public void insert(Board board) throws BoardException {
		for (Board item : this.list) {
			if (item.equals(board)) {
				// 1. 기존 등록된 같은 번호의 게시글이 존재할 경우
				throw new BoardException("E01: 중복된 번호의 게시글입니다.");
			}
		}
		
		list.add(board);
	}
	
	// 1.
	public List<Board> selectAll() {
		return this.list;
	}
	
	// 1.							// 2.
	public void delete(Board board) throws BoardException {
		for (int i = 0; i < this.list.size(); i++) {
			if (this.list.get(i).equals(board)) {
				this.list.remove(this.list.get(i));
				return;
			}
		}
		
		// 1.
		throw new BoardException("E02: 삭제할 게시글이 존재하지 않습니다.");
	}
	
	// 1.
	public void update(Board board) {
		for (Board item : this.list) {
			if (item.equals(board)) {
				/*
				 * id: 검색 조건이기 때문에 변경 필요 없음
				 * writer: 기존 작성한 작성자와 동일하다고 가정해서 변경 필요 없음
				 * regDate: 글 생성일이기 때문에 일자를 변경 필요 없음
				 */
				item.setContent(board.getContent());
				item.setTitle(board.getTitle());
			}
		}
	}
}
