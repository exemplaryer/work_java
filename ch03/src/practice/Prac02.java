package practice;

import java.util.Scanner;

/*
 * �� ���α׷����� ���� ������ �����ϴ� ���α׷����� �����Ͽ� �ۼ��Ͻÿ�.
 * 
 * - �Է¹��� �� �Ǽ��� ��� ������ ��ȯ�Ͽ� �հ� ��� ��� �Ǽ��� ���
 */
public class Prac02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Ǽ��� �Է��ϼ��� >> ");
		
		// ����� ����ȯ
		int num01 = (int)input.nextDouble();
		int num02 = (int)input.nextDouble();
		
		// ������ ����ȯ
		/*
		 * num01�� num02�� ���� int ���̰�
		 * double sum ������ ������� �� �ڵ����� double ������ ����ȴ�.
		 * 
		 * double sum�� int�� 2�� ������ ����� double���̰�
		 * ���������� double avg ������ ���� �־��� ������ �ڵ����� double ������ ����ȴ�.
		 */
		double sum = num01 + num02;
		double avg = sum / 2;
		
		System.out.printf("��: %.2f, ���: %.2f %n", sum, avg);
		
		input.close();
	}
	
}
