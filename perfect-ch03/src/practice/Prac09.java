package practice;

import java.util.Scanner;

/*
 * 표준입력으로 키와 몸무게를 실수로 입력받아 다음 조건을 이용하여 정상인지,
 * 비만인지 출력하는 프로그램을 작성하시오.
 * 
 * - (몸무게 <= (키 - 100) * 0.9)이면 정상, 아니면 비만
 */
public class Prac09 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 순서대로 입력하세요 >> ");
		double height = input.nextDouble();
		double weight = input.nextDouble();
		
		if (weight <= ((height - 100) * 0.9)) {
			System.out.println("정상 입니다.");
		}
		else {
			System.out.println("비만 입니다.");
		}
	}
}
