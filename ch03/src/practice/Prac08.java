package practice;

import java.util.Scanner;

/*
 * �� ���� �Է¹޾� ���� ū ���� ���ϴ� ���α׷����� ���� �����ڸ� �̿��Ͽ�
 * �ۼ��Ͻÿ�.
 */
public class Prac08 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ��� >> ");
		
		int num01 = input.nextInt();
		int num02 = input.nextInt();
		int num03 = input.nextInt();
		
		int res = num01 > num02 ? 
				(num01 > num03 ? num01 : num03) : (num02 > num03 ? num02 : num03);
				
		System.out.println("���� ū ��: " + res);
	}
}









