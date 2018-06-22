import java.util.Scanner;

public class Ch05Ex02_15 {
	public static void main(String[] args) {
		int[][] score = new int[4][3];

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%dclass? ", i + 1);
			
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");
			
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = Integer.parseInt(numbers[j]);
			}
		}
		
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			System.out.printf("%dclass : %d%n", i + 1, sum);
		}
	}
}
