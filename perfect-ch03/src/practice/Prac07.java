package practice;

import java.util.Scanner;

/*
 * 조건연산자(삼항연산자)를 이용하여 임의의 달을 입력받아 이 달이 상반기이면 "상반기입니다."를
 * 하반기이면 "하반기입니다."를 출력하는 프로그램을 작성하시오.
 */
public class Prac07 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("달을 입력하세요 >> ");
		
		int month = input.nextInt();
		
		/*if (month > 0 && month <= 6) {
			System.out.println("상반기입니다.");
		}
		else if (month >= 7 && month <= 12) {
			System.out.println("하반기입니다.");
		}*/
		
		String result = month > 6 ? "하반기입니다." : "상반기입니다.";
		System.out.println(result);
	}
}





