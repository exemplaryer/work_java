package com.koitt.java.ch07;

/*
 * 관례
 * T: type
 * E: element
 */
public class GenericTest<T> {
	public boolean myEqual(T a, T b) {
		return a.equals(b);
	}
	
	public boolean myEqual2(String a, String b) {
		return a.equals(b);
	}
	
	public boolean myEqual2(Integer a, Integer b) {
		return a.equals(b);
	}
	
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		Integer c = 1;
		Integer d = 1;
		
		// String 타입을 이용하는 myEqual 메소드를 호출할 수 있게 된다.
		GenericTest<String> test = new GenericTest<String>();
		boolean isEqual = test.myEqual(a, b);
		System.out.println(isEqual);
		
		/*boolean isEqual2 = test.myEqual(c, d);
		System.out.println(isEqual2);*/
	}
}
