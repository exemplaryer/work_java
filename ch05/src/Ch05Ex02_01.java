import java.util.Scanner;

public class Ch05Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] chars = scanner.nextLine().split(" ");
		
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i] + " ");
		}
	}
}
