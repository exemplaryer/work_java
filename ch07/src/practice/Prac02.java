package practice;

public class Prac02 {
	
	public static void main(String[] args) {
		// Byte, Short, Integer, Long, Float, Double, Character, Boolean
		
		// Boxing
		Byte b = 10;
		Short s = 100;
		Integer i = 1000;
		Long l = 1000000L;
		Float f = 3.14F;
		Double d = 3.1415;
		Character c = 'A';
		Boolean bb = true;
		
		// UnBoxing
		System.out.printf("%d%n", b);
		System.out.printf("%d%n", s);
		System.out.printf("%d%n", i);
		System.out.printf("%d%n", l);
		System.out.printf("%f%n", f);
		System.out.printf("%f%n", d);
		System.out.printf("%c%n", c);
		System.out.printf("%b%n", bb);
	}
}
