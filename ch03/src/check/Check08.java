package check;

public class Check08 {
	
	public static void main(String[] args) {
		/*
		 * 1.
		 */
		int n = 20;
		if (n % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		/*
		 * 2.
		 */
		double x = 3.8, y = 4.9;
		double max = x > y ? x : y;
		double min = x < y ? x : y;
		
		System.out.printf("최대: %f\n", max);
		System.out.printf("최소: %f\n", min);
		
		/*
		 * 3.
		 */
		int n1 = 5;
		switch (n1 % 3) {
			case 0:
				System.out.printf("3의 배수입니다.\n");
				break;
			case 1: case 2:
				System.out.printf("3의 배수가 아닙니다.\n");
				break;
		}
		
		/*
		 * 4.
		 */
		/*int x = 20;
		switch (x) {
		case x > 0:
			System.out.printf("양수\n");
			break;
		case x < 0:
			System.out.println("음수\n");
		}*/
		int x1 = 20;
		if (x1 > 0) {
			System.out.printf("양수\n");
		}
		else if (x1 < 0) {
			System.out.println("음수\n");
		}
	}
}














