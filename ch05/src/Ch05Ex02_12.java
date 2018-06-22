import java.util.Scanner;

public class Ch05Ex02_12 {
	public static void main(String[] args) {
		int[] numbers = new int[2];

		int i = 0;
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			if (i == numbers.length) {
				int[] tmp = new int[numbers.length * 2];
				System.arraycopy(numbers, 0, tmp, 0, numbers.length);
				numbers = tmp;
			}

			numbers[i] = num;
			if (numbers[i] == 0) {
				break;
			}

			i++;
		}
		
		int[] counter = new int[10];
		for (int j = 0; j < i; j++) {			
			int index = numbers[j] / 10 - 1;
			counter[index]++;
		}
		
		for (int j = counter.length - 1; j >= 0; j--) {
			if (counter[j] != 0) {
				System.out.printf("%d : %d person%n", (j + 1) * 10, counter[j]);
			}
		}
	}
}
