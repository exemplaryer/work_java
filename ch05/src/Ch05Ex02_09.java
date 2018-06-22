import java.util.Scanner;

public class Ch05Ex02_09 {
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
		
		System.out.println(i);
		
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] == 0) {
				break;
			}
			
			System.out.print((numbers[j] % 2 != 0 ? numbers[j] * 2 : numbers[j] / 2) + " ");
		}
	}
}
