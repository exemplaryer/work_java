import java.util.Scanner;

public class Ch05Ex02_13 {
	public static void main(String[] args) {
		// 1. 배열 생성(첫항과 두번째 항만 저장하는 배열 우선 생성)
		int[] stream = new int[2];

		// 2. 첫번째항과 두번째 항은 입력받은 수로 초기화
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		stream[0] = Integer.parseInt(numbers[0]);
		stream[1] = Integer.parseInt(numbers[1]);

		for (int i = 2; i < 10; i++) {
			// 배열이 꽉 찼을 경우
			if (i == stream.length) {
				int[] tmp = new int[stream.length * 2];	// 원래 배열의 2배 크기로 만든다.
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				stream = tmp;
			}

			int result = (stream[i - 2] + stream[i - 1]) % 10;
			stream[i] = result;

			if (result < 0) {
				break;
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(stream[i] + " ");
			if (stream[i] < 0) {
				break;
			}
		}
	}
}
