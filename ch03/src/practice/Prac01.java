package practice;

import java.util.Scanner;

/*
 * 표준입력으로 두 실수를 입력받아 합과 평균을 구하여 출력하는 프로그램을
 * 작성하시오.
 * 
 * - 합과 평균 모두 실수로 출력
 */
public class Prac01 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("두 실수를 입력하세요 >> ");
		
		double num01 = input.nextDouble();
		double num02 = input.nextDouble();
		
		double sum = num01 + num02;
		double avg = sum / 2;
		
		System.out.printf("합: %.2f, 평균: %.2f %n", sum, avg);
		
		input.close();
	}
}














