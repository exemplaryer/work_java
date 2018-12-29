package ch03;

public class OperatorEx06 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		//byte c = a + b;	// 컴파일 에러가 발생한다. 명시적으로 형변환이 필요하다.
		byte c = (byte)(a + b);
		
		System.out.println(c);
		
		/*
		 * 자바의 정수 기본형은 int이다
		 * 따라서 계산을 할때는 다시 int형으로 변경해서 계산하게 된다.
		 * 결론은 별일 없으면 그냥 int를 사용하라.
		 */
	}
}
