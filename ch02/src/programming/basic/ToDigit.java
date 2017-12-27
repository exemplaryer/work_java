package programming.basic;

import java.util.Scanner;

public class ToDigit {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int val = scanner.nextInt();
		
		System.out.printf("%o %n", val);
		System.out.printf("%d %n", val);
		System.out.printf("%h %n", val);
		
		scanner.close();
	}
}
