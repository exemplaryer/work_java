import java.util.Scanner;

/*
 * 1005 : 소인수분해
 * 
 * N개의 정수가 주어졌을 때 가장 큰 소수를 소인수로 가지는 숫자를 찾는 프로그램을 작성하라.
 * 
 * 여기서 소인수란 어떤 정수 x를 나누어떨어지게 할 수 있는 소수를 뜻하며 
 * 소수란 1과 자기 자신만을 나누어 떨어지게 할 수 있는 숫자를 뜻한다.
 * 
 * 만약 36, 38, 40, 42의 숫자가 주어졌을 때 
 * 38의 경우 소수 19를 소인수로 가지게 되므로 답은 38이 된다.
 * 
 * 입력 형식: 입력의 첫 번째 줄은 정수의 개수를 뜻하는 N(1≤N≤5,000)이 입력된다.
 * 그 다음 줄부터 임의의 정수가 한 줄에 하나씩 입력되며 같은 숫자가 2번 들어오는 경우는 존재 하지 않는다.
 * 주어지게 되는 정수의 범위는 1 이상 20,000 이하이다.
 * 
 * 출력 형식: 입력에 대해서 가장 큰 소수를 소인수로 가지는 숫자를 출력한다.
 * 만약 가장 큰 소수를 소인수로 가지는 숫자가 2개이상 존재 할 경우 먼저 입력 된 것을 출력한다.
 * 
 * 입력 예:
 * 4
 * 36
 * 38
 * 40
 * 42
 * 
 * 출력 예:
 * 38
 * 
 */
public class Ex1005 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		if (!(1 <= n && n <= 5000)) {
			System.out.println("INPUT ERROR!");
			return;
		}

		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(scanner.nextLine());
			if (1 <= num && num <= 20000) {
				numbers[i] = num;
			}
			else {
				System.out.println("INPUT ERROR!");
				return;
			}
		}
		
		int maxPrimeDivisor = -1;
		int maxPrimeDivisorIndex = -1;
		for (int i = 0; i < n; i++) {
			int result = getMaxPrimeDivisor(numbers[i]);
			maxPrimeDivisor = result > maxPrimeDivisor ? result : maxPrimeDivisor;
			if (maxPrimeDivisor == result) {
				maxPrimeDivisorIndex = i;
			}
		}
		
		System.out.println(numbers[maxPrimeDivisorIndex]);
	}

	// 최대 소인수를 구하는 메소드 
	private static int getMaxPrimeDivisor(int num) {
		// 변수 num: 소수를 구할 범위
		// 변수 i: num 범위에 포함이 되고, 나눌 대상이 되는 수
		int i = 2;

		// 소인수 중 젤 큰 소인수를 저장하는 변수
		int maxPrimeDivisor = -1;

		while (i <= num) {
			boolean isPrime = true;

			// i를 각각 2, 3, 4 ...로 나눈 나머지가 0이면 소수가 아니다.
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					isPrime = false;
					break;
				}
			}

			// i가 소수일 경우 maxPrime 변수에 저장한다.
			if (isPrime == true && num % i == 0) {
				maxPrimeDivisor = i > maxPrimeDivisor ? i : maxPrimeDivisor;
			}
			
			i++;
		}
		
		return maxPrimeDivisor;
	}
}
