package Practice;

import java.util.Scanner;

public class T3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");

		int num = input.nextInt();

		do {
			System.out.print(num % 10); // num을 10으로 나눈 나머지 출력
			num = num / 10; // num을 10으로 나눈 몫을 num에 저장
		} while (num > 0);
	}
}
