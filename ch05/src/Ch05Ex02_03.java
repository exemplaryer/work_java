import java.util.Scanner;

public class Ch05Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) {
				odd += Integer.parseInt(numbers[i]);
			}
			else {
				even += Integer.parseInt(numbers[i]);
			}
		}
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
