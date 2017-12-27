package conversion;

public class ToYard {
	
	public static void main(String[] args) {
		double meter = 100.785;
		System.out.println(meter * 1.0936);
		
		double dollar = 10.28; // 10달러 28센트
		double dollar2 = 20.10; // 20달러 10센트
		
		double result1 = dollar + dollar2;
		double result2 = dollar - dollar2;
		double result3 = dollar * dollar2;
		double result4 = dollar / dollar2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		int temp1 = (int)(dollar * 100);
		int temp2 = (int)(dollar2 * 100);
		
		double result5 = (double)(temp1 + temp2) / 100;
		System.out.println(result5);
	}
}
