package practice;

import java.util.Scanner;

/*
 * õ�� ������ ���� �ϳ��� �Է� �޾� �츮�� ����ϴ� ������ ��, õ, ��, ��, �� ������
 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * - �� �Է��� 2347653�̸� "234�� 7õ 6�� 5�� 3�Դϴ�."�� ���
 */
public class Prac06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է��ϼ��� >> ");
		
		int num = input.nextInt();
		
		int man = num / 10000;
		System.out.println(man);
		
		int chun = num % 10000 / 1000;
		System.out.println(chun);
		
		int beak = num % 1000 / 100;
		System.out.println(beak);
		
		int ten = num % 100 / 10;
		System.out.println(ten);
		
		int one = num % 10 / 1;
		System.out.println(one);
		
		System.out.printf("%d�� %dõ %d�� %d�� %d�Դϴ�. %n", man, chun, beak, ten, one);
	}
}












