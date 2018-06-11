import java.util.Scanner;

public class Ch04Ex02_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		int count = 1;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j < i) {
					System.out.print("  ");
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
