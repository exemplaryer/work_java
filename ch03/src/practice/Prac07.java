package practice;

import java.util.Scanner;

/*
 * ���ǿ�����(���׿�����)�� �̿��Ͽ� ������ ���� �Է¹޾� �� ���� ��ݱ��̸� "��ݱ��Դϴ�."��
 * �Ϲݱ��̸� "�Ϲݱ��Դϴ�."�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Prac07 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� >> ");
		
		int month = input.nextInt();
		
		/*if (month > 0 && month <= 6) {
			System.out.println("��ݱ��Դϴ�.");
		}
		else if (month >= 7 && month <= 12) {
			System.out.println("�Ϲݱ��Դϴ�.");
		}*/
		
		String result = month > 6 ? "�Ϲݱ��Դϴ�." : "��ݱ��Դϴ�.";
		System.out.println(result);
	}
}





