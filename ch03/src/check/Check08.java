package check;

public class Check08 {
	
	public static void main(String[] args) {
		/*
		 * 1.
		 */
		int n = 20;
		if (n % 2 == 0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
		
		/*
		 * 2.
		 */
		double x = 3.8, y = 4.9;
		double max = x > y ? x : y;
		double min = x < y ? x : y;
		
		System.out.printf("�ִ�: %f\n", max);
		System.out.printf("�ּ�: %f\n", min);
		
		/*
		 * 3.
		 */
		int n1 = 5;
		switch (n1 % 3) {
			case 0:
				System.out.printf("3�� ����Դϴ�.\n");
				break;
			case 1: case 2:
				System.out.printf("3�� ����� �ƴմϴ�.\n");
				break;
		}
		
		/*
		 * 4.
		 */
		/*int x = 20;
		switch (x) {
		case x > 0:
			System.out.printf("���\n");
			break;
		case x < 0:
			System.out.println("����\n");
		}*/
		int x1 = 20;
		if (x1 > 0) {
			System.out.printf("���\n");
		}
		else if (x1 < 0) {
			System.out.println("����\n");
		}
	}
}














