import java.util.Scanner;

/*
 * 1012 : K-리그
 * 
 * K리그가 한창 진행중이다. 
 * 규칙에 따르면 경기에서 이긴 팀은 3점을 얻고 비기면 1을 지면 0점을 받는다.
 * 현재 팀들의 점수와 전체 치뤄진 경기의 수가 입력되면 현재까지 비긴 경기의 개수를 찾아라.
 * 
 * 입력 형식: 입력의 첫 번째 줄에는 각각 팀의 수(0≤T≤200)와 경기의 수(0≤N≤10,000)가 입력된다.
 * 다음 T줄에 걸쳐 팀 이름과 (10글자 이하의 문자열) 그 팀이 얻은 포인트가 입력된다.
 * 
 * 출력 형식: 현재까지 비긴 경기의 수를 출력한다.
 * 
 * 입력 예:
 * 3 3
 * Suwon 5
 * Seoul 1
 * Cheju 1
 * 
 * 출력 예:
 * 2
 * 
 */
public class Ex1012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] input = scanner.nextLine().split(" ");
		int t = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);

		boolean isError01 = !(0 <= t && t <= 200);
		boolean isError02 = !(0 <= n && n <= 10000);
		if (isError01 || isError02) {
			System.out.println("INPUT ERROR!");
			return;
		}

		String[][] scoreBoard = new String[t][2];
		for (int i = 0; i < t; i++) {
			String[] teamScore = scanner.nextLine().split(" ");
			scoreBoard[i] = teamScore;
		}

		// 총점 구하기
		int sum = 0;
		for (int i = 0; i < t; i++) {
			sum += Integer.parseInt(scoreBoard[i][1]);
		}

		// 총점에서 최대 승수 구하기
		int win = sum / 3;
		
		/*
		 *  총점에서 승수만큼 점수를 뺀 다음 
		 *  남은 점수로 가능한 무승부 수를 구해
		 *  승수와 무승부 수를 더해서 총 경기 수와 같을 때까지
		 *  승수를 점점 줄이면서 무승부 수를 구한다.
		 */
		int draw = 0;
		for (int i = win; i >= 0; i--) {
			draw = (sum - i * 3) / 2;
			if (n == (i + draw)) {
				System.out.println(draw);
				return;
			}
		}
		System.out.println(0);
	}
}
