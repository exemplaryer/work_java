import java.util.Scanner;

public class Ch05Ex02_16 {
	public static void main(String[] args) {
		int[][] a1 = new int[2][3];
		int[][] a2 = new int[2][3];

		System.out.println("first array");

		// a1 배열에 입력받은 값을 저장
		for (int j = 0; j < a1.length; j++) {
			// 2. 정수 입력받기
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			// 3. 입력받은 정수를 a? 배열에 저장하기
			for (int i = 0; i < numbers.length; i++) {
				a1[j][i] = Integer.parseInt(numbers[i]);
			}
		}

		System.out.println("second array");

		// a2 배열에 입력받은 값을 저장
		for (int j = 0; j < a2.length; j++) {
			// 2. 정수 입력받기
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			// 3. 입력받은 정수를 a? 배열에 저장하기
			for (int i = 0; i < numbers.length; i++) {
				a2[j][i] = Integer.parseInt(numbers[i]);
			}
		}
		
		// 4. 새로운 배열에 저장
		int[][] result = new int[2][3];
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[i].length; j++) {
				result[i][j] = a1[i][j] * a2[i][j];
			}
		}
		
		// 5. 출력하기
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
