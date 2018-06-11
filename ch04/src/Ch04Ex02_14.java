import java.util.Scanner;

public class Ch04Ex02_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		int dan01 = Integer.parseInt(numbers[0]);
		int dan02 = Integer.parseInt(numbers[1]);
		
		if (dan01 < dan02) {
			for (int i = 1; i <= 9; i++) {
				for (int j = dan01; j <= dan02; j++) {
					System.out.printf("%d * %d = %2d\t", j, i, j * i);
				}
				System.out.println();
			}
			
		} else if (dan01 > dan02) {
			for (int i = 1; i <= 9; i++) {
				for (int j = dan01; j >= dan02; j--) {
					System.out.printf("%d * %d = %2d\t", j, i, j * i);
				}
				System.out.println();
			}
		}
	}
}
