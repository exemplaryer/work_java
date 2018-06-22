import java.util.Scanner;

public class Ch05Ex02_17 {
	public static void main(String[] args) {
		int[][] array = new int[4][2];

		// array 배열에 입력받은 값을 저장
		for (int j = 0; j < array.length; j++) {
			// 2. 정수 입력받기
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			// 3. 입력받은 정수를 a? 배열에 저장하기
			for (int i = 0; i < numbers.length; i++) {
				array[j][i] = Integer.parseInt(numbers[i]);
			}
		}
		
		// 가로평균 출력
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
			System.out.print(sum / 2 + " ");
		}
		System.out.println();
		
		// 세로평균 출력
		for (int i = 0; i < 2; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += array[j][i];
			}
			System.out.print(sum / 4 + " ");
		}
		System.out.println();
		
		// 전체평균 출력
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println(sum / 8);
	}
}
