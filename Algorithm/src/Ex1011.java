import java.util.Scanner;

/*
 * 1011 : 소수369
 * 
 * 369게임은 많은 사람들이 즐기는 게임으로 원으로 둘러앉아서 순서대로 1부터 숫자를 부르면서 
 * 3이 들어가는 숫자(다른 방법으론 3의 배수)를 부를 경우 숫자 대신 박수를 쳐야하는 게임이다.
 * 어느날 학생들이 소풍을 가서 369게임을 하려고 한다. 하지만 369 게임은 너무 식상하다 생각하던 차라 
 * 박수를 치는 수를 소수(1이외에 자기 자신으로만 나눠지는 2이상의 숫자)로 바꿔서 게임을 하고자 한다.
 * 게임을 학생들의 수와 마지막에 부른 번호가 주어졌을 때 특정 사람이 박수를 몇 번 쳤는지 알아보는 프로그램을 작성하라.
 * 
 * 입력 형식: 입력은 한 줄로 주어진다. 
 * 학생 수 N(2≤N≤1,000)이 주어지고, 끝까지 부른 숫자 M(1≤M≤1,000,000)이 주어지며, 
 * 박수를 몇 번 쳤는지 알고 싶은 사람의 번호 K(0≤K＜N) 가 주어진다.
 * 첫 번째 숫자를 부르는 학생은 0번 마지막 학생은 N-1번이며 N-1번 학생 다음에는 0번 학생의 차례가 오게 된다.
 * 
 * 출력 형식: 해당 번호의 사람이 박수를 치는 횟수를 출력하라.
 * 
 * 입력 예:
 * 3 9 1
 * 
 * 출력 예:
 * 2
 */
public class Ex1011 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1. 숫자 3개 입력받기
		String[] input = scanner.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int k = Integer.parseInt(input[2]);
		
		// 2. 입력받은 값 유효성 검사
		boolean isError01 = !(2 <= n && n <= 1000);
		boolean isError02 = !(1 <= m && m <= 1000000);
		boolean isError03 = !(0 <= k && k < n);
		
		// 3. 유효성 검사 후 이상이 있으면 프로그램 종료
		if (isError01 || isError02 || isError03) {
			System.out.println("INPUT ERROR!");
			return;
		}
		
		// 4. 박수 친 횟수를 저장하는 배열 생성
		int[] clap = new int[n];
		
		// 5. getPrime() 메소드를 통해서 m 값까지의 소수를 구해 배열로 저장
		String[] strPrimes = getPrime(m).split(" ");
		
		/*
		 *  6. 소수를 학생 수로 나눈 나머지를 이용해 박수 친 횟수를 clap 배열에 저장한다.
		 *  
		 *  예를 들면, 학생 수가 3명이고, 9까지의 소수는 2, 3, 5, 7 이다.
		 *  0번 학생이 1번부터 부르게 되므로 부른 번호 % 학생 수 하게되면 일정한 규칙을 발견할 수 있다.
		 *  1 % 3 = 1    ---    0번 학생
		 *  2 % 3 = 2    ---    1번 학생
		 *  3 % 3 = 0    ---    2번 학생
		 *  4 % 3 = 1    ---    0번 학생
		 *  5 % 3 = 2    ---    1번 학생
		 *  ...
		 *  
		 *  clap 배열의 인덱스 번호와 맞춰주기 위해 원래 나눌 수에 +2씩 한다.
		 *  (1 + 2) % 3 = 0    ---    0번 학생
		 *  (2 + 2) % 3 = 1    ---    1번 학생
		 *  (3 + 2) % 3 = 2    ---    2번 학생
		 *  (4 + 2) % 3 = 0    ---    0번 학생
		 *  (5 + 2) % 3 = 1    ---    1번 학생
		 *  ...
		 *  
		 *  for문을 돌면서 소수일 때의 clap 배열 인덱스 번호를 구해
		 *  해당 인덱스에 숫자를 증가시키면 된다.
		 */
		for (int i = 0; i < strPrimes.length; i++) {
			int prime = Integer.parseInt(strPrimes[i]);
			int index = (prime + 2) % n;
			clap[index]++;
		}
		
		// 7. k값을 이용하여 clap 배열의 해당 인덱스 값을 출력하면 된다.
		System.out.println(clap[k]);
	}
	
	private static String getPrime(int num) {
		// 변수 num: 소수를 구할 범위
		// 변수 i: num 범위에 포함이 되고, 나눌 대상이 되는 수
		int i = 2;
		
		// 결과를 리턴할 변수
		String result = "";

		while (i <= num) {
			boolean isPrime = true;

			// i를 각각 2, 3, 4 ...로 나눈 나머지가 0이면 소수가 아니다.
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					isPrime = false;
					break;
				}
			}

			// i가 소수일 경우 result 변수에 붙인다.
			if (isPrime == true) {
				result += i + " ";
			}
			
			i++;
		}
		
		return result;
	}
}
