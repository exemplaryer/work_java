import java.util.Scanner;

/*
 * 1009 : 각 자리수의 역과 합
 * 
 * 양의 정수를 입력받아 역으로 보여주고 각 자리 숫자의 합을 구하는 프로그램을 작성하라.
 * 
 * 입력 형식: 21억 이하의 양의 정수를 입력받는다. 잘못된 데이터는 입력되지 않는다.
 * 하나의 결과가 나온 후에도 계속 새로운 입력을 받다가 0이 입력되면 프로그램을 종료한다.
 * 
 * 출력 형식: 입력받은 수의 역과 각 자리 숫자의 합을 공백으로 구분하여 출력한다.
 * 유효하지않은 "0"은 출력하지 않는다. 입력받은 수의 역도 21억 이하의 정수이다.
 * 
 * 입력 예: 
 * 453
 * 123456
 * 0
 * 
 * 출력 예:
 * 354 12
 * 654321 21
 */
public class Ex1009 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String input = scanner.nextLine();
			
			if (input.trim().equals("0")) {
				return;
			}

			int[] numbers = new int[input.length()];
			int sum = 0;

			for (int i = 0, cursor = input.length() - 1; i < numbers.length; i++, cursor--) {
				numbers[i] = Character.getNumericValue(input.charAt(cursor));
				sum += numbers[i];
				System.out.print(numbers[i]);
			}
			System.out.printf(" %d%n", sum);
		}
	}
}
