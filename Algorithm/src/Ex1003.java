import java.util.Scanner;

/*
 * 1003 : 줄 세우기
 * 
 * 점심시간이 되면 반 학생 모두가 한 줄로 줄을 서서 급식을 탄다.
 * 그런데 매일 같이 앞자리에 앉은 학생들이 앞에 줄을 서 먼저 점심을 먹고 
 * 뒷자리에 앉은 학생들은 뒤에 줄을 서 늦게 점심을 먹게 된다. 
 * 어떻게 하면 이러한 상황을 바꾸어 볼 수 있을까 고민하던 중 선생님이 한 가지 방법을 내 놓았다. 
 * 그 방법은 다음과 같다.
 * 
 * 학생들이 한 줄로 줄을 선 후 첫 번째 학생부터 차례​로 번호를 뽑는다.​
 * 첫 번째로 줄을 선 학생은 무조건 0번 번호를 받아 제일 앞에 줄을 선다.
 * 두 번째로 줄을 선 학생은 0번 또는 1번 둘 중 하나의 번호를 뽑는다.
 * 0번을 뽑으면 그 자리에 그대로 있고 1번을 뽑으면 바로 앞의 학생 앞으로 가서 줄을 선다.
 * 세 번째로 줄을 선 학생은 0 1 또는 2 중 하나의 번호를 뽑는다. 그리고 뽑은 번호만큼 앞자리로 가서 줄을 선다.
 * 마지막에 줄을 선 학생까지 이와 같은 방식으로 뽑은 번호만큼 앞으로 가서 줄을 서게 된다.
 * 각자 뽑은 번호는 자신이 처음에 선 순서보다는 작은 수이다.
 * 
 * 예를 들어 5명의 학생이 줄을 서고 첫 번째로 줄을 선 학생부터 다섯 번째로 줄을 선 학생까지 
 * 차례로 0 1 1 3 2번의 번호를 뽑았다고 하자. 
 * 첫 번째 학생부터 다섯 번째 학생까지 1부터 5로 표시하면 학생들이 줄을 선 순서는 다음과 같이 된다.
 * 
 * 첫 번째 학생이 번호를 뽑은 후 : 1
 * 두 번째 학생이 번호를 뽑은 후 : 2 1
 * 세 번째 학생이 번호를 뽑은 후 : 2 3 1
 * 네 번째 학생이 번호를 뽑은 후 : 4 2 3 1
 * 다섯 번째 학생이 번호를 뽑은 후 : 4 2 5 3 1
 * 따라서 최종적으로 학생들이 줄을 선 순서는 4 2 5 3 1이 된다.
 * 
 * 줄을 선 학생들이 차례로 뽑은 번호가 주어질 때 학생들이 최종적으로 줄을 선 순서를 출력하는 프로그램을 작성하시오.
 * 
 * 입력 형식: 첫째 줄에는 학생의 수가 주어지고 둘째 줄에는 줄을 선 차례대로 학생들이 뽑은 번호가 주어진다.
 * 학생의 수가 100 이하이고 학생들이 뽑는 번호는 0 또는 자연수이며 학생들이 뽑은 번호 사이에는 빈 칸이 하나씩 있다.
 * 
 * 출력 형식: 학생들이 처음에 줄을 선 순서대로 1번부터 번호를 매길 때 
 * 첫째 줄에 학생들이 최종적으로 줄을 선 순서를 그 번호로 출력한다.
 * 학생 번호 사이에는 한 칸의 공백을 출력한다.
 * 
 * 입력 예
 * 5
 * 0 1 1 3 2
 * 
 * 출력 예
 * 4 2 5 3 1
 * 
 */
public class Ex1003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		if (n > 100) {
			System.out.println("INPUT ERROR!");
			return;
		}
		
		String[] numbers = scanner.nextLine().split(" ");
		
		int[] seq = new int[1];
		for (int i = 0, no = 1; i < n; i++, no++) {
			int index = Integer.parseInt(numbers[i]);
			
			// 배열의 공간이 부족할 경우에 공간을 늘려준다.
			if (index >= seq.length) {
				int[] temp = new int[index + 1];
				System.arraycopy(seq, 0, temp, 0, seq.length);
				seq = temp;
			}
			
			// 이미 배열에 값이 입력되어 있는 경우
			if (seq[index] != 0) {
				int[] temp = new int[seq.length + 1];		// 1칸을 늘린다.
				System.arraycopy(seq, 0, temp, 0, index);	// 0번째부터 index-1번째까지 내용을 복사
				System.arraycopy(seq, index, temp, index + 1, seq.length - index);	// index번째부터 끝까지의 내용을 복사
				seq = temp;
			}
			seq[index] = no;
		}
		
		// 순서 출력(뒤에서부터 출력)
		for (int i = seq.length - 1; i >= 0; i--) {
			System.out.print(seq[i] + " ");
		}
	}
}
