package practice;

import java.util.Scanner;

/*
 * 세 수를 입력받아 가장 큰 수를 구하는 프로그래밍을 조건 연산자를 이용하여
 * 작성하시오.
 */
public class Prac08 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("세 수를 입력하세요 >> ");
		
		int num01 = input.nextInt();
		int num02 = input.nextInt();
		int num03 = input.nextInt();
		
		int res = num01 > num02 ? 
				(num01 > num03 ? num01 : num03) : (num02 > num03 ? num02 : num03);
				
		System.out.println("가장 큰 수: " + res);
	}
}









