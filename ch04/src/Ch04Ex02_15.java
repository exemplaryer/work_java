import java.util.Scanner;

public class Ch04Ex02_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		int i = 1;
		boolean isDesc = false;
		while (i != 0) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if (i == num) {
				isDesc = true;
			}
			
			if (!isDesc) {
				i++;
			}
			else {
				i--;
			}
		}
	}
}
