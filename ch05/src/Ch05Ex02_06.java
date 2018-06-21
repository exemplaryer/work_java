import java.util.Scanner;

public class Ch05Ex02_06 {
	public static void main(String[] args) {
		char[] alphabets = {'A', 'P', 'P', 'L', 'E', '!'};
		
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.nextLine().charAt(0);
		
		boolean isFind = false;
		for (int i = 0; i < alphabets.length; i++) {
			if (ch == alphabets[i]) {
				isFind = true;
				System.out.println(i);
				break;
			}
		}
		
		if (isFind == false) {
			System.out.println("none");
		}
	}
}
