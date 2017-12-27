package programming.basic;

public class PrintfTest1 {
	
	public static void main(String[] args) {
		
		/*
		 * %d(Decimal): 10진수
		 * %f: 실수로 출력
		 * %s(String): 문자열
		 */
		
		// 6-1
		System.out.printf("%d %f %s", 10, 3.7854, "정수");
		
		System.out.println();
		
		// 6-2
		/*
		 * 1$: year
		 * 2$: amount
		 */
		int year = 2014;
		double amount = 1;
		System.out.format("%1$d %2$f %2$8.1f %1$d", year, amount);		
	}
}
