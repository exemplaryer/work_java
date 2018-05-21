package practice;

import java.util.Scanner;

/*
 * 다음을 참고로 표준입력으로 받은 년도의 윤년을 판단하는 프로그램을
 * if문을 사용하여 작성하시오.
 * 
 * - 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
 * - 첫번째 조건에서 100으로 나누어 떨어지는 해는 평년으로 하며,
 * - 다만 400으로 나누어 떨어지는 해는 윤년으로 정한다.
 */
public class Prac05 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요 >> ");
		int year = input.nextInt();
		
		// 1단계
		/*if (year % 4 == 0) {
			if (year % 100 != 0) {
				System.out.println("윤년 입니다.");
			}
			else if (year % 400 == 0) {
				System.out.println("윤년 입니다.");
			}
		}
		else {
			System.out.println("평년 입니다.");
		}*/
		
		// 2단계
		/*if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("윤년 입니다.");
		}
		else {
			System.out.println("평년 입니다.");
		}*/
		
		// 3단계
		boolean cond01 = year % 4 == 0;
		boolean cond02 = year % 100 != 0;
		boolean cond03 = year % 400 == 0;
		
		if (cond01 && cond02 || cond03) {
			System.out.println("윤년 입니다.");
		}
		else {
			System.out.println("평년 입니다.");
		}
	}
}









