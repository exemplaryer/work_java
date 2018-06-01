import java.util.Scanner;

/*
 * 1004 : 합과 평균 표준편차
 * 
 * 도시락 집 회계 담당을 하는 철기는 손님들이 드시는 음식의 가격들을 집계하여 매일 이들의 합산 가격과 
 * 평균 도시락 가격과 표준 편차를 구해야 하는 임무를 가지고 있다. 
 * 매일 업무 종료 때마다 이를 구해야하는 철기군 처음에는 직접 계산하다가 매일 바뀌는 도시락 수와 가격에 
 * 복잡함을 느껴 이를 프로그램으로 만들려고 한다.
 * 
 * 평균 및 표준편차는 반올림해서 소수점 첫째 자리까지 구한다. 
 * 표준 편차의 공식은 도시락 각각의 가격을 Xi라고 하고 평균을 M이라고 한다면 다음과 같다.
 * (Ex1004.jpg 참고)
 * 
 * 표준편차란 자료의 분산 정도를 나타내는 수치로 분산의 양의 제곱근으로 표준 편차가 작은 것은 
 * 평균값 주위의 분산의 정도가 작은 것을 나타낸다.
 * 
 * 입력 형식: 첫 번째 줄에는 도시락의 수 n(1부터 100사이의 정수)이 입력되고 
 * 다음 줄부터 n개의 줄에는 각 도시락의 가격(1,000부터 4,000사이의 정수)들을 입력받는다.
 * 하나의 결과가 출력되면 프로그램을 종료한다. 데이터의 크기가 주어진 범위를 벗어나는 데이터는 입력되지 않는다.
 * 
 * 출력 형식: 위에서 입력한 자료에 맞추어서 도시락 가격의 합계와 평균 가격, 표준편차를 출력한다.
 * 평균과 표준편차는 소수점이하 둘째 자리에서 반올림하여 첫째자리까지 출력한다.
 * 단, 소수점이하 둘째 자리에서 반올림한 값에서 소수점이하 첫째자리가 0일 경우는 출력하지 않는다.
 * 
 * 입력 예
 * 3
 * 1500
 * 2000
 * 2500
 * 
 * 출력 예
 * 6000
 * 2000
 * 408.2
 * 
 */
public class Ex1004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		if (!(1 <= n && n <= 100)) {
			System.out.println("INPUT ERROR!");
			return;
		}
		
		// 도시락 가격을 배열에 저장하고, 합계 구하기
		double[] prices = new double[n];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			int price = Integer.parseInt(scanner.nextLine());
			if (1000 <= price && price <= 4000) {
				prices[i] = price;
				sum += price;
			}
			else {
				System.out.println("INPUT ERROR!");
				return;
			}
		}
		
		// 평균 구하기
		double avg = sum / n;
		
		// (각 도시락 가격 - 평균)제곱의 합계 구하기
		double sumOfSquare = 0;
		for (int i = 0; i < n; i++) {
			sumOfSquare += Math.pow(prices[i] - avg, 2);
		}
		
		// 표준편차(Standard Deviation)
		double stdDev = Math.sqrt(sumOfSquare / n);
		
		System.out.printf("%d%n", (int)sum);
		printNum(avg);
		printNum(stdDev);
	}
	
	/* 
	 * 평균과 표준편차는 소수점이하 둘째 자리에서 반올림하여 첫째자리까지 출력
	 * 소수점이하 둘째 자리에서 반올림한 값에서 소수점이하 첫째자리가 0일 경우는 출력하지 않음
	 */
	private static void printNum(double num) {
		if ((int)((num + 0.05) * 10) % 10 == 0) {
			System.out.printf("%.0f%n", num + 0.05);
		}
		else {
			System.out.printf("%.1f%n", num);
		}
	}
}
