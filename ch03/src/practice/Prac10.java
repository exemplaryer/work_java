package practice;

import java.util.Scanner;

/*
 * ������ �ݾ��� ������ �Է¹޾� ȭ������� ���� �� ���� �ʿ�����
 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * - �Է��� �ּ� õ �� ������ �Է�
 * - ȭ������� 50000, 10000, 5000, 1000 4�����̸�, ������ ū ȭ������� ����
 */
public class Prac10 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ��� >> ");
		int money = input.nextInt();
		
		// ��� 1
		/*int fiveMan = money / 50000;
		System.out.println(fiveMan);
		
		money = money - fiveMan * 50000;
		
		int man = money / 10000;
		System.out.println(man);
		
		money = money - man * 10000;
		
		int fiveChun = money / 5000;
		System.out.println(fiveChun);
		
		money = money - fiveChun * 5000;
		
		int chun = money / 1000;
		System.out.println(chun);*/
		
		//��� 2
		int fiveMan = money / 50000;
		int man = money % 50000 / 10000;
		int fiveChun = money % 10000 / 5000;
		int chun = money % 5000 / 1000;
		System.out.printf("5������ %d��%n1������ %d��%n5õ���� %d��%nõ���� %d��%n",
				fiveMan, man, fiveChun, chun);
	}
}
