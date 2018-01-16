package com.koitt.java.board.controller;

import java.util.Scanner;

import com.koitt.java.board.model.Board;
import com.koitt.java.board.service.BoardService;

public class BoardController {
	
	private BoardService service;
	
	private Scanner input;
	
	public BoardController() {
		this.service = new BoardService();
		this.input = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		BoardController controller = new BoardController();
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("=== KOITT 게시판 ===");
			System.out.println("1. 게시글 추가");
			System.out.println("2. 게시글 전체목록 출력");
			System.out.println("3. 게시글 삭제");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴번호 입력 > ");
			
			int menu = Integer.parseInt(input.nextLine());
			
			switch (menu) {
				case 1:
					controller.menuAdd();
					break;
					
				case 2:
					break;
					
				case 3:
					break;
				
				case 4:
					break;
					
				case 5:
					break;
					
				default:
					System.out.println("메뉴번호를 다시 입력해주세요.");
			}
		}
	}
	
	public void menuAdd() {
		System.out.println("=== 게시글 추가 ===");
		
		System.out.print("글 제목: ");
		String title = this.input.nextLine();
		
		System.out.print("글 내용: ");
		String content = this.input.nextLine();
		
		System.out.print("작성자: ");
		String writer = this.input.nextLine();
		
		/*
		 *  id가 null값인 이유는 Service에서 id값을 생성하기 때문에
		 *  regDate가 null값인 이유는 Controller는 화면관련 클래스이기 때문에
		 *  regDate의 초기화는 Service 클래스에 맡긴다.
		 */
		Board board = new Board(null, title, content, writer, null);
		
		// 생성한 객체를 service로 전달한다.
		this.service.add(board);
	}
}
