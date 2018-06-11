import java.util.Scanner;

public class Ch04Ex02_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		if (num > 6) {
			System.out.println("INPUT ERROR!");
			return;
		}
		
		char alphabet = 'A';
		int count = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				int limit = num - i;
				if (j < limit) {
					System.out.print(alphabet + " ");
					alphabet++;
				}
				else {
					System.out.print(count + " ");
					count++;
					if (count == 10) {
						count = 0;
					}
				}
			}
			System.out.println();
		}
	}
}
