package practice;

import java.util.Scanner;

/*
 * ǥ���Է����� Ű�� �����Ը� �Ǽ��� �Է¹޾� ���� ������ �̿��Ͽ� ��������,
 * ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * - (������ <= (Ű - 100) * 0.9)�̸� ����, �ƴϸ� ��
 */
public class Prac09 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ű�� �����Ը� ������� �Է��ϼ��� >> ");
		double height = input.nextDouble();
		double weight = input.nextDouble();
		
		if (weight <= ((height - 100) * 0.9)) {
			System.out.println("���� �Դϴ�.");
		}
		else {
			System.out.println("�� �Դϴ�.");
		}
	}
}
