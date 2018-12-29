package ch03;

public class OperatorEx01 {
	public static void main(String[] args) {
		int i = 5;
		i++;					// i = i + 1;과 같은 의미이다. ++i;로 바꿔써도 결과는 같다.
		System.out.println(i);
		
		i = 5;	// 결과를 비교하기 위해 i값을 다시 5로 변경.
		++i;
		System.out.println(i);
		
		/*
		 * i++는 변수 i를 사용하고 1 증가
		 * ++i는 먼저 1 증가하고 변수 i를 사용
		 */
		i = 5;
		System.out.println(i++);	// 사용하고 1 증가이기 때문에 5 출력, i = 6
		
		i = 5;
		System.out.println(++i);	// 1 증가하고 사용하기 때문에 6 출력, i = 6
	}
}
