import java.util.Scanner;

public class Ch05Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		int[] nums = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			nums[i] = Integer.parseInt(numbers[i]);
		}
		
		System.out.println(nums[0] + nums[2] + nums[4]);
	}
}
