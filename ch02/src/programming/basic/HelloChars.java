package programming.basic;

public class HelloChars {
	
	public static void main(String[] args) {
		System.out.println('a');	// char 형
		System.out.println('\\');	// \ 출력
		
		// 8진수 142의 ASCII 코드 값(10진수 98의 ASCII 코드값)
		System.out.println('\142');
		
		System.out.println('\uAC00');	// UTF-8(Unicode) 값 AC00 : 가
		System.out.println('\uAC01');	// UTF-8(Unicode) 값 AC01 : 각
		System.out.println('강');
		
		System.out.print("Hello\nWorld\tHi\b\rABC\r\n");
		System.out.println("\'");
	}
}
