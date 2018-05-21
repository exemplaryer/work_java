package practice;

import java.util.Scanner;

/*
 * 천만 이하의 정수 하나를 입력 받아 우리가 사용하는 단위인 만, 천, 백, 십, 일 단위로
 * 출력하는 프로그램을 작성하시오.
 * 
 * - 즉 입력이 2347653이면 "234만 7천 6백 5십 3입니다."로 출력
 */
public class Prac06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수 하나를 입력하세요 >> ");
		
		int num = input.nextInt();
		
		int man = num / 10000;
		System.out.println(man);
		
		int chun = num % 10000 / 1000;
		System.out.println(chun);
		
		int beak = num % 1000 / 100;
		System.out.println(beak);
		
		int ten = num % 100 / 10;
		System.out.println(ten);
		
		int one = num % 10 / 1;
		System.out.println(one);
		
		System.out.printf("%d만 %d천 %d백 %d십 %d입니다. %n", man, chun, beak, ten, one);
	}
}












