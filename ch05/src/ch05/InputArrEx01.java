package ch05;

import java.util.Scanner;

public class InputArrEx01 {
	public static void main(String[] args) {
		// 여러개의 입력 값을 배열에 저장하는 방법 (한줄에 값이 하나일 경우)
		
		// 1. 배열 선언 (예: 값 2개 입력받기)
		int[] numbers = new int[2];
		
		// 2. 배열 크기를 이용하여 for문 이용
		for (int i = 0; i < numbers.length; i++) {
			Scanner scanner = new Scanner(System.in);
			numbers[i] = Integer.parseInt(scanner.nextLine());
		}
		
		// 3. 입력받은 값 출력해보기
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// 한줄에 여러 개의 값이 띄어쓰기로 구분 된 경우는
		// 기존처럼 scanner.nextLine().split(" "); 을 이용하면
		// 리턴되는 형태가 배열 형태이므로 그대로 사용하면 된다.
	}
}
