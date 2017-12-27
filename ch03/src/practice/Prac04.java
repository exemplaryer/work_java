package practice;

import java.util.Scanner;

/*
 * 문자 하나와 온도를 실수형으로 입력받아, 문자가 F나 f이면 입력받은 값을
 * 화씨로 간주하여 섭씨로 바꾸고,
 * 입력받은 문자가 C나 c이면 입력받은 값을 섭씨로 간주하여 화씨로 바꾸어 결과를
 * 출력하는 프로그램을 작성하시오.
 * 
 * - F = (9.0 / 5.0) * C + 32
 * - C = (5.0 / 9.0) * (F - 32)
 */
public class Prac04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("문자 하나를 입력하세요 (C: 섭씨, F: 화씨) >> ");
		String inputString = input.next();
		char unit = inputString.charAt(0);
		
		System.out.println("온도를 입력하세요 >> ");
		double degree = input.nextDouble();
		
		double result = 0.0;
		switch (unit) {
			case 'F':
			case 'f':
				result = (5.0 / 9.0) * (degree - 32);
				System.out.format("섭씨 %.2f 입니다.", result);
				break;
				
			case 'C':
			case 'c':
				result = (9.0 / 5.0) * degree + 32;
				System.out.format("화씨 %.2f 입니다.", result);
				break;
		}
	}
}








