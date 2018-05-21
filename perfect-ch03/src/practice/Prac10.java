package practice;

import java.util.Scanner;

/*
 * 지불할 금액을 정수로 입력받아 화폐단위가 각각 몇 개씩 필요한지
 * 출력하는 프로그램을 작성하시오.
 * 
 * - 입력은 최소 천 원 단위로 입력
 * - 화폐단위는 50000, 10000, 5000, 1000 4가지이며, 가능한 큰 화폐단위로 지불
 */
public class Prac10 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("금액을 입력하세요 >> ");
		int money = input.nextInt();
		
		// 방법 1
		/*int fiveMan = money / 50000;
		System.out.println(fiveMan);
		
		money = money - fiveMan * 50000;
		
		int man = money / 10000;
		System.out.println(man);
		
		money = money - man * 10000;
		
		int fiveChun = money / 5000;
		System.out.println(fiveChun);
		
		money = money - fiveChun * 5000;
		
		int chun = money / 1000;
		System.out.println(chun);*/
		
		//방법 2
		int fiveMan = money / 50000;
		int man = money % 50000 / 10000;
		int fiveChun = money % 10000 / 5000;
		int chun = money % 5000 / 1000;
		System.out.printf("5만원권 %d개%n1만원권 %d개%n5천원권 %d개%n천원권 %d개%n",
				fiveMan, man, fiveChun, chun);
	}
}
