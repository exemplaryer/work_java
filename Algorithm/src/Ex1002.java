import java.util.Scanner;

/*
 * 1002 : 최대공약수, 최소공배수
 * 
 * n개의 정수를 입력받아서 최대공약수와 최소공배수를 구하는 프로그램을 작성하여 보자.
 * 
 * 입력형식: 첫째 줄에 N (2≤N≤10) 을 입력받고 다음 줄에 N개의 정수를 공백으로 구분하여 입력받는다.
 * 입력받는 정수는 2이상 10,000 이하이다. 데이터의 크기가 주어진 범위를 벗어나는 입력은 없다.
 * 
 * 출력형식: 입력받은 정수들의 최대공약수와 최소공배수를 공백으로 구분하여 출력한다.
 * 최소공배수는 20억 이하의 정수이다.
 * 
 * 입력 예
 * 3
 * 2 8 10
 * 
 * 출력 예
 * 2 40
 * 
 * 힌트
 * 두 개의 수 A와 B의 최대공약수를 D라 하면, 세 개의 수 A, B, C의 최대공약수는 D와 C의 최대공약수와 같다.
 * 최소공배수 역시 두 수의 최소공배수를 구해 나가는 방법으로 구할 수 있다.
 * 
 * 최대공약수, 최소공배수 설명은 http://trsketch.dothome.co.kr/a11002 사이트 참고
 */
public class Ex1002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		if (!(2 <= n && n <= 10000)) {
			System.out.println("INPUT ERROR!");
			return;
		}

		String[] numbers = scanner.nextLine().split(" ");
		
		int curGcd = Integer.parseInt(numbers[0]);
		int curLcm = Integer.parseInt(numbers[0]);
		for (int i = 1; i < n; i++) {
			curGcd = gcd(curGcd, Integer.parseInt(numbers[i]));
			curLcm = lcm(curLcm, Integer.parseInt(numbers[i]));
		}
		
		System.out.printf("%d %d%n", curGcd, curLcm);
	}

	// 최대공약수(Greatest Common Divisor)
	/*
     * 유클리드 알고리즘 이용
	 * 2개의 자연수(또는 정식) a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면 (단, a>b) a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
	 * 이 성질에 따라, b를 r로 나눈 나머지 r'를 구하고, 다시 r을 r'로 나눈 나머지를 구하는 과정을 반복하여 
	 * 나머지가 0이 되었을 때 나누는 수가 a와 b의 최대공약수이다.
	 * 
	 */
	private static int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return Math.abs(a);
	}
	
	// 최소공배수(Least Common Multiple)
	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
