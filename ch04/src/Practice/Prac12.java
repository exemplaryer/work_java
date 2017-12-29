package Practice;

import java.util.Scanner;

/*
 * 래기드 배열로 풀이
 */
public class Prac12 {
	
	public static void main(String[] args) {
		// 표준 입력 받기
		Scanner input = new Scanner(System.in);
		System.out.println("최대 별 개수를 입력하세요 >> ");
		int count = input.nextInt();
		
		// 배열 선언 및 초기화
		char[][] array = new char[count][];
		
		// 래기드 배열 만들기
		for (int i = 0; i < array.length; i++) {
			array[i] = new char[i + 1];
		}
		
		// 별을 배열에 저장
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = '*';
			}
		}
		
		// 배열에 있는 별을 끄집어 내어 출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
