package practice;

import java.util.Scanner;

/*
 * ������ ������ ų�α׷�(kg)�� �Ҽ��� �Է¹޾� �Ŀ��(pound)�� ����Ͽ�
 * �Ҽ��� 3�ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * - 1�Ŀ��(pound)�� 0.453592ų�α׷�(kg)
 */
public class Prac03 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("ų�α׷�(kg)�� �Է��ϼ��� >> ");
		
		double kg = input.nextDouble();
		double pound = kg * 1000000 / 453592;
		
		System.out.printf("�Ŀ��(pound): %.3f", pound);
		
	}
}













