package practice;

import java.util.Scanner;

/*
 * 위 프로그램에서 다음 조건을 만족하는 프로그램으로 수정하여 작성하시오.
 * 
 * - 입력받은 두 실수를 모두 정수로 변환하여 합과 평균 모두 실수로 출력
 */
public class Prac02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("두 실수를 입력하세요 >> ");
		
		// 명시적 형변환
		int num01 = (int)input.nextDouble();
		int num02 = (int)input.nextDouble();
		
		// 묵시적 형변환
		/*
		 * num01과 num02의 합은 int 형이고
		 * double sum 변수에 집어넣을 때 자동으로 double 형으로 변경된다.
		 * 
		 * double sum과 int형 2를 나누면 결과는 double형이고
		 * 마찬가지로 double avg 변수에 집어 넣었기 때문에 자동으로 double 형으로 변경된다.
		 */
		double sum = num01 + num02;
		double avg = sum / 2;
		
		System.out.printf("합: %.2f, 평균: %.2f %n", sum, avg);
		
		input.close();
	}
	
}
