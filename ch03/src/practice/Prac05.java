package practice;

import java.util.Scanner;

/*
 * ������ ����� ǥ���Է����� ���� �⵵�� ������ �Ǵ��ϴ� ���α׷���
 * if���� ����Ͽ� �ۼ��Ͻÿ�.
 * 
 * - ��� ������ 4�� ������ �������� �ش� �켱 �������� �ϰ�,
 * - ù��° ���ǿ��� 100���� ������ �������� �ش� ������� �ϸ�,
 * - �ٸ� 400���� ������ �������� �ش� �������� ���Ѵ�.
 */
public class Prac05 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�⵵�� �Է��ϼ��� >> ");
		int year = input.nextInt();
		
		// 1�ܰ�
		/*if (year % 4 == 0) {
			if (year % 100 != 0) {
				System.out.println("���� �Դϴ�.");
			}
			else if (year % 400 == 0) {
				System.out.println("���� �Դϴ�.");
			}
		}
		else {
			System.out.println("��� �Դϴ�.");
		}*/
		
		// 2�ܰ�
		/*if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("���� �Դϴ�.");
		}
		else {
			System.out.println("��� �Դϴ�.");
		}*/
		
		// 3�ܰ�
		boolean cond01 = year % 4 == 0;
		boolean cond02 = year % 100 != 0;
		boolean cond03 = year % 400 == 0;
		
		if (cond01 && cond02 || cond03) {
			System.out.println("���� �Դϴ�.");
		}
		else {
			System.out.println("��� �Դϴ�.");
		}
	}
}









