import java.util.Scanner;

public class Ch05Ex02_04 {
	public static void main(String[] args) {
		int[] stream = new int[2];

		int i = 0;
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String num = scanner.nextLine();

			if (i == stream.length) {
				int[] tmp = new int[stream.length * 2];
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				stream = tmp;
			}

			stream[i] = Integer.parseInt(num);
			if (stream[i] == -1) {
				break;
			}

			i++;
		}

		for (int j = 0; j < stream.length; j++) {
			if (stream[j] == -1) {
				int init = j < 3 ? j : 3;
				for (int k = init; k >= 1; k--) {
					System.out.print(stream[j - k] + " ");
				}
			}
		}

	}
}
