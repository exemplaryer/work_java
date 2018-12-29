package ch03;

public class OperatorEx28 {
	public static void main(String[] args) {
		int x = 0xAB, y = 0xF;
		
		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X \t%s%n", x, y, y, x ^ y ^ y, 
				toBinaryString(x ^ y ^ y));
	}
	
	// 10진 정수를 2진수로 변환하는 메소드
	static String toBinaryString(int num) {
		String zero = "00000000000000000000000000000000";	// 32비트(32개)
		String tmp = zero + Integer.toBinaryString(num);
		
		/*
		 * substring(int) 메소드
		 * 괄호 안의 int 값에 해당하는 문자부터 문자열로 잘라낸다.
		 */
		return tmp.substring(tmp.length() - 32);
	}
}
