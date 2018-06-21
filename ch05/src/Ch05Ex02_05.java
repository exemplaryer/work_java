import java.util.Scanner;

public class Ch05Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += Double.parseDouble(numbers[i]);
		}
		
		System.out.printf("%.1f%n", sum / numbers.length);
	}
}
