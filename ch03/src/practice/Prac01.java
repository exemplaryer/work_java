package practice;

import java.util.Scanner;

/*
 * ǥ���Է����� �� �Ǽ��� �Է¹޾� �հ� ����� ���Ͽ� ����ϴ� ���α׷���
 * �ۼ��Ͻÿ�.
 * 
 * - �հ� ��� ��� �Ǽ��� ���
 */
public class Prac01 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Ǽ��� �Է��ϼ��� >> ");
		
		double num01 = input.nextDouble();
		double num02 = input.nextDouble();
		
		double sum = num01 + num02;
		double avg = sum / 2;
		
		System.out.printf("��: %.2f, ���: %.2f %n", sum, avg);
		
		input.close();
	}
}














