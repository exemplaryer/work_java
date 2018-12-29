package ch02;

public class SpecialCharEx {
	public static void main(String[] args) {
		/*
		 * 특수문자(Escape sequence)
		 * tab: \t
		 * backspace: \b
		 * form feed: \f
		 * new line: \n
		 * carriage return: \r
		 * 역슬래쉬(\): \\
		 * 작은따옴표: \'
		 * 큰따옴표: \"
		 * 유니코드(16진수)문자: \\u유니코드 (예: char a = '\u0041')
		 */
		System.out.println('\'');				// '''처럼 할 수 없다.
		System.out.println("abc\t123\b456");	// \b에 의해 3이 지워진다.
		System.out.println('\n');				// 개행(new line)문자 출력하고 개행
		System.out.println("\"Hello\"");		// 큰따옴표를 출력하려면 이렇게 한다.
		System.out.println("c:\\");				// 역슬래쉬 출력
	}
}
