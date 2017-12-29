package Practice;

import java.util.Scanner;

/*
 * 정사각형 배열로 풀이
 */
public class Prac12_01 {

	public static void main(String[] args) {
		// 표준 입력 받기
		Scanner input = new Scanner(System.in);
		System.out.println("최대 별 개수를 입력하세요 >> ");
		int count = input.nextInt();
		
		char[][] array = new char[count][count];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i >= j) {
					array[i][j] = '*';
				}
				else {
					array[i][j] = ' ';
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
