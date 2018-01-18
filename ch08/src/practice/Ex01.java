package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		int x = 0, y = 0, z = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("정수 두 개 입력: ");
		while (true) {
			try {
				System.out.println("정수 x 입력: ");
				x = Integer.parseInt(input.nextLine());
				
				System.out.println("정수 y 입력: ");
				y = Integer.parseInt(input.nextLine());
				
				z = x * y;
				System.out.printf("%d * %d = %d%n", x, y, z);
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("정수 두 개를 입력하세요.");
				continue;
			}
			catch (NumberFormatException e) {
				System.out.println("정수 두 개를 입력하세요.");
				continue;
			}
		}
	}
}
