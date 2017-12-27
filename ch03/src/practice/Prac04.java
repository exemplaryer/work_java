package practice;

import java.util.Scanner;

/*
 * ���� �ϳ��� �µ��� �Ǽ������� �Է¹޾�, ���ڰ� F�� f�̸� �Է¹��� ����
 * ȭ���� �����Ͽ� ������ �ٲٰ�,
 * �Է¹��� ���ڰ� C�� c�̸� �Է¹��� ���� ������ �����Ͽ� ȭ���� �ٲپ� �����
 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * - F = (9.0 / 5.0) * C + 32
 * - C = (5.0 / 9.0) * (F - 32)
 */
public class Prac04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �ϳ��� �Է��ϼ��� (C: ����, F: ȭ��) >> ");
		String inputString = input.next();
		char unit = inputString.charAt(0);
		
		System.out.println("�µ��� �Է��ϼ��� >> ");
		double degree = input.nextDouble();
		
		double result = 0.0;
		switch (unit) {
			case 'F':
			case 'f':
				result = (5.0 / 9.0) * (degree - 32);
				System.out.format("���� %.2f �Դϴ�.", result);
				break;
				
			case 'C':
			case 'c':
				result = (9.0 / 5.0) * degree + 32;
				System.out.format("ȭ�� %.2f �Դϴ�.", result);
				break;
		}
	}
}








