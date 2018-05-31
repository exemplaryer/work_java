import java.util.Scanner;

/*
 * 1001 : 강아지와 병아리
 * 
 * 강아지와 병아리의 합과 다리의 수를 입력받아 강아지와 병아리가 각각 몇 마리씩인지 구하는 프로그램을 작성하시오.
 * 
 * 입력형식: 강아지와 병아리의 합 1000 이하 다리의 합 4000 이하의 음이 아닌 정수가 공백으로 구분하여 입력된다.
 * 하나의 결과가 나온 후에도 계속 새로운 입력을 받다가 0 0 이 입력되면 프로그램을 종료한다.
 * 
 * 출력형식: 강아지와 병아리가 각각 몇 마리씩인지 공백으로 구분하여 출력한다.
 * 주어진 데이터로 마리수를 정할 수 없을 때는 "0" 을 출력한다.
 * 데이터의 크기가 주어진 범위를 벗어날 경우는 "INPUT ERROR!"를 출력한다.
 * 
 * 입력 예
 * 25 80
 * 15 10
 * 1500 20000
 * 0 0
 * 
 * 출력 예
 * 15 10
 * 0
 * INPUT ERROR!
 */
public class Ex1001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String[] input = scanner.nextLine().split(" ");
			int num = Integer.parseInt(input[0]);
			int legs = Integer.parseInt(input[1]);

			// 0 0을 입력 받았을 경우
			if (num == 0 && legs == 0) {
				System.exit(0);	// 정상종료
			}
			
			// 입력 값이 범위를 벗어난 경우
			if (!(0 <= num && num <= 1000 && 0 <= legs && legs <= 4000)) {
				System.out.println("INPUT ERROR!");
			}
			// 입력받은 다리의 개수가 최소로 나올 다리의 개수보다 작을 경우 
			else if (legs < num * 2) {
				System.out.printf("%d%n", 0);
			}
			else {
				for (int chicks = 0; chicks <= num; chicks++) {
					int dogs = num - chicks;
					int sumOfLegs = dogs * 4 + chicks * 2;
					if (sumOfLegs == legs) {
						System.out.printf("%d %d%n", dogs, chicks);
						break;
					}
				}
			}
		}
	}
}
