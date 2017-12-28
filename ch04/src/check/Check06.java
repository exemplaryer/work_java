package check;

public class Check06 {
	
	public static void main(String[] args) {
		// 1.
		/*int i, sum;
		for (i = 1, sum = 0; i <= 10; i++)
			sum += i;
		System.out.printf("%d, %d\n", i, sum);*/
		
		int i = 1, sum = 0;
		for (i=1, sum=0; i<=10; ++i)
            sum += i;
		System.out.printf("%d ,%d\n", i, sum);
	}
}
