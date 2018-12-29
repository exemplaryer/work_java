package ch03;

public class OperatorEx04 {
	public static void main(String[] args) {
		int i = -10;	// i는 -10
		i = +i;			// i는 -10 (+는 곱하기 +1 한 것과 동일)
		System.out.println(i);	// -10 출력
		
		i = -10;		// i는 -10
		i = -i;			// i는 10 (-는 곱하기 -1 한 것과 동일)
		System.out.println(i);	// 10 출력
	}
}
