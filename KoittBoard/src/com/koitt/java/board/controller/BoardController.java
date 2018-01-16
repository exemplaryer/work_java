package com.koitt.java.board.controller;

import java.util.List;
import java.util.Scanner;

import com.koitt.java.board.exception.BoardException;
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
					controller.menuRead();
					break;
					
				case 3:
					// 4.
					controller.menuRemove();
					break;
				
				case 4:
					// 4.
					controller.menuModify();
					break;
					
				case 5:
					// 1.
					input.close();	// 표준 입출력 종료
					System.exit(0);	// 0: 정상종료
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
		
		// 4.
		try {
			// 생성한 객체를 service로 전달한다.
			this.service.add(board);
			System.out.println("입력완료!");
		}
		catch (BoardException e) {
			System.out.println(e.getMessage());
		}
	}
	
	// 3.
	public void menuRead() {
		System.out.println("=== 게시글 전체목록 출력 ===");
		List<Board> list = this.service.read();
		for (Board item : list) {
			System.out.println(item);
		}
	}
	
	// 3.
	public void menuRemove() {
		System.out.println("=== 게시글 삭제 ===");
		
		System.out.print("삭제할 글 번호를 입력하세요: ");
		Integer id = Integer.parseInt(this.input.nextLine());
		
		//Board board = new Board(id, null, null, null, null);
		Board board = new Board();
		board.setId(id);
		
		this.service.remove(board);
	}
	
	// 3.
	public void menuModify() {
		System.out.println("=== 게시글 수정 ===");
		
		System.out.print("수정할 글 번호를 입력하세요: ");
		Integer id = Integer.parseInt(this.input.nextLine());
		
		System.out.print("글 제목: ");
		String title = this.input.nextLine();
		
		System.out.print("글 내용: ");
		String content = this.input.nextLine();
		
		/*
		 * writer: 변경되지 않기 때문에 null
		 * regDate: 변경되지 않기 때문에 null
		 */
		Board board = new Board(id, title, content, null, null);
		
		this.service.modify(board);
	}
}
