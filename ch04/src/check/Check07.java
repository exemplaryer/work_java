package check;

public class Check07 {

	public static void main(String[] args) {
		// 2.
		/*int sum = 0;
		for (int i = 1; i <= 10; i++)
			sum += i;
		System.out.println(sum + " ");*/
		
		// 4.
		/*int i = 1;
		while (i < 10) {
			if (i % 2 == 0) {
				i++;
				continue;
			}
			System.out.println(i++);
		}*/
		
		// 5.
		int i = 1, sum = 0, mult = 1;
		do {
			sum += i; mult *= i;
		}
		while (++i <= 10);
	}
}








