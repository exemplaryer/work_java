package programming.basic;

import java.util.Scanner;

public class PersonInfo {
	
	static int weight;
	static double height;
	
	public static void main(String[] args) {
		System.out.print("몸무게와 키를 입력하세요: ");
		
		// 키보드 입력을 받을 준비 끝
		Scanner x = new Scanner(System.in);
		
		weight = x.nextInt();
		height = x.nextDouble();
		
		System.out.printf("몸무게: %dkg, 키: %fcm", weight, height);
		System.out.println("몸무게: " + weight + "kg, 키: " + height + "cm");
		
		x.close();		
	}
}
