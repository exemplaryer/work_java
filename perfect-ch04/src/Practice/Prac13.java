package Practice;

// 구구단 2: 세로로 같은 단 출력 
public class Prac13 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}
	}
}
