package ch03;

public class OperatorEx03 {
	public static void main(String[] args) {
		int i = 5, j = 5;
		
		System.out.println(i++);	// 변수 i 먼저 사용하기 때문에 5 출력
		System.out.println(++j);	// 1 증가하고 변수 j 사용하기 때문에 6 출력
		System.out.println("i = " + i + ", j = " + j);
	}
}
