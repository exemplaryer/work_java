package programming.basic;

import java.util.Scanner;

public class PersonInfo {
	
	static int weight;
	static double height;
	
	public static void main(String[] args) {
		System.out.print("�����Կ� Ű�� �Է��ϼ���: ");
		
		// Ű���� �Է��� ���� �غ� ��
		Scanner x = new Scanner(System.in);
		
		weight = x.nextInt();
		height = x.nextDouble();
		
		System.out.printf("������: %dkg, Ű: %fcm", weight, height);
		System.out.println("������: " + weight + "kg, Ű: " + height + "cm");
		
		x.close();		
	}
}
