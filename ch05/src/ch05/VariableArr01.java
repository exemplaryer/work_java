package ch05;

public class VariableArr01 {
	public static void main(String[] args) {
		int[][] score = new int[5][];
		score[0] = new int[4];
		score[1] = new int[3];
		score[2] = new int[2];
		score[3] = new int[2];
		score[4] = new int[3];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				if (i == 0) {
					score[i][j] = 100;
				}
				else if (i == 1) {
					score[i][j] = 20;
				}
				else if (i == 2) {
					score[i][j] = 30;
				}
				else if (i == 3) {
					score[i][j] = 40;
				}
				else if (i == 4) {
					score[i][j] = 50;
				}
			}
		}
		
		// 출력
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}
}
