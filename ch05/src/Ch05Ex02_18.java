import java.util.Scanner;

public class Ch05Ex02_18 {
	public static void main(String[] args) {
		char[][] chars = new char[3][5];

		// chars 배열에 입력받은 값을 저장
		for (int j = 0; j < chars.length; j++) {
			// 2. 정수 입력받기
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			// 3. 입력받은 정수를 a? 배열에 저장하기
			for (int i = 0; i < numbers.length; i++) {
				chars[j][i] = numbers[i].charAt(0);
			}
		}
		
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars[i].length; j++) {
				System.out.print((char)(chars[i][j] + 32) + " ");				
			}
			System.out.println();
		}
	}
}
