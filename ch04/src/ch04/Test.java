package ch04;

public class Test {
	public static void main(String[] args) {
		char ch = 'y';
		if (ch != 'y') {
			System.out.println("같지 않다.");
		}
		else {
			System.out.println("같다.");
		}
		
		String a = "y";
		if (a.charAt(0) != 'y') {
			System.out.println("같지 않다.");
		}
		else {
			System.out.println("같다.");
		}
	}
}
