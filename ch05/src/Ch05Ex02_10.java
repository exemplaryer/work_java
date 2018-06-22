import java.util.Scanner;

public class Ch05Ex02_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		if (count > 20) {
			return;
		}
		int[] score = new int[count];
		
		String[] tmp = scanner.nextLine().split(" ");
		for (int i = 0; i < tmp.length; i++) {
			score[i] = Integer.parseInt(tmp[i]);
		}
		
		// 4. score 배열을 이용하여 버블정렬 (책대로 오름차순 정렬하기)
		for (int i = 0; i < score.length - 1; i++) {
			boolean changed = false;	// 자리바꿈이 발생했는지를 체크한다.

			for (int j = 0; j < score.length - 1 - i; j++) {
				if (score[j] > score[j + 1]) { // 옆의 값이 작으면 서로 바꾼다.
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
					changed = true;	// 자리바꿈이 발생했으니 changed를 true로.
				}
			}

			if (!changed) break;	// 자리바꿈이 없으면 반복문을 벗어난다.
		}

		// 5. 오름차순 정렬된 배열을 거꾸로 출력하기 (내림차순 출력)
		for (int i = score.length - 1; i >= 0; i--) {
			System.out.println(score[i]);
		}
	}
}
