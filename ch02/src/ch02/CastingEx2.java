package ch02;

public class CastingEx2 {
	public static void main(String[] args) {
		// int���� ���� 10�� byte Ÿ������ �������� �� -> �����ս� ����
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		
		// int���� ���� 300�� byte Ÿ������ �������� �� -> �����ս� �߻�
		// byte�� ���� ���� -128~127�� �ʰ��߱� ������ �����ս��� �߻��Ѵ�.
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		System.out.println("i=" + Integer.toBinaryString(i)); // 300�� 2������ ���
		
		// byte���� ���� 10�� int Ÿ������ �������� �� -> �����ս� ����
		// int Ÿ���� ������ -20�� ~ +20���̱� ������ �����ս��� ����.
		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		
		// byte���� ���� -2�� int Ÿ������ �������� �� -> �����ս� ����
		// int Ÿ���� ������ -20�� ~ +20���̱� ������ �����ս��� ����.
		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		
		System.out.println("i=" + Integer.toBinaryString(i));
	}
}
