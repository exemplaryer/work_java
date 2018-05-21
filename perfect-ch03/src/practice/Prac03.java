package practice;

import java.util.Scanner;

/*
 * 무게의 단위인 킬로그램(kg)을 소수로 입력받아 파운드(pound)로 계산하여
 * 소수점 3자리까지 출력하는 프로그램을 작성하시오.
 * 
 * - 1파운드(pound)는 0.453592킬로그램(kg)
 */
public class Prac03 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("킬로그램(kg)을 입력하세요 >> ");
		
		double kg = input.nextDouble();
		double pound = kg * 1000000 / 453592;
		
		System.out.printf("파운드(pound): %.3f", pound);
		
	}
}













