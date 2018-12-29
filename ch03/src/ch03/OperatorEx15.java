package ch03;

public class OperatorEx15 {
	public static void main(String[] args) {
		// 'a'의 아스키 코드값은 97
		// 'A'의 아스키 코드값은 65
		// 대문자 'A'와 소문자 'a'의 차이는 32
		// 따라서 대문자 'A'에 + 32하면 소문자 'a'
		// 소문자 'a' - 32하면 대문자 'A'가 된다.
		
		// 대문자 'B'와 소문자 'b'의 차이도 32이다.
		
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32); // 97 - 32 = 65 = 'A'
		
		System.out.println(upperCase); // 'A'
	}
}
