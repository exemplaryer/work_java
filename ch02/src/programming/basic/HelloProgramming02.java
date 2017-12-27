package programming.basic;

// 1줄짜리 주석
// 안녕하세요 반갑습니다

// 여러줄 입력하는 주석
/* 동해물과 백두산이
  마르고 닳도록
  하느님이 보우하사
  우리나라 만세 */

// JavaDoc 주석
/**
 * 
 * @author KOITT
 */

/*
 *  주석 단축키 (블럭 지정 후)
 *  주석 설정: Ctrl + Shift + /
 *  주석 해제: Ctrl + Shift + \
 */
public class HelloProgramming02 {
	
	static String hello = "안녕하세요. 여러분 - 반갑습니다.";
	static String hello02 = "Hello";
	
	public static void main(String[] args) {
		
		String hello2 = "Hello! Hack!";
		String hello3 = "Everyone!";
		
		print10(hello2);
		
		printSum(10, 20);
		
		print10(hello2);
		
		printSum(50, 30);
		
		printSum(20, 70);
		
		printSum(100, 30);
		
		print10(hello3);
		
	}
	
	// 같은 내용 10번 출력하는 메소드
	static void print10(String word) {
		for (int i = 0; i < 10; i++) {
			System.out.println(hello);
		}
	}
	
	// 두 수의 합을 출력하는 메소드
	static void printSum(int a, int b) {
		int result = a + b;
		System.out.println(hello);
	}
}
