package ch03;

public class Ex07 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius: " + celcius);
		
		// ������ Ǯ� �� ������ �����ϸ� �Ʒ��� ����. ���� �ϼ���.
		/*int a = (fahrenheit - 32);
		float b = 5 / 9f;
		float c = (b * a) * 100;
		float d = c + 0.5f;
		float e = (int)d / 100f;*/
	}
}
