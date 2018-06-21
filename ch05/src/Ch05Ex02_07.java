import java.util.Scanner;

public class Ch05Ex02_07 {
	public static void main(String[] args) {
		int[] stream = new int[2];

		int i = 0;
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			if (i == stream.length) {
				int[] tmp = new int[stream.length * 2];
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				stream = tmp;
			}
			
			stream[i] = num;
			
			if (stream[i] == 999) {
				break;
			}
			
			i++;
		}
		
		int min = stream[0];
		int max = stream[0];
		
		i = 0;
		while (stream[i] != 999) {
			min = min < stream[i] ? min : stream[i];
			max = max > stream[i] ? max : stream[i];
			i++;
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
