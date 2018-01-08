package com.koitt.java.ch07;

public class WrapperCharacter {
	public static void main(String[] args) {
		//Character ch = new Character('@');
		Character ch = '@';		// boxing
		Character ch2 = '@';
		
		System.out.print(ch + " ");	// unboxing
		System.out.print(ch.charValue() + " ");
		System.out.println(ch.toString());
		System.out.print(ch.compareTo('!') + " ");
		System.out.println(ch.hashCode());
		System.out.println(ch2.hashCode());
		System.out.println();
		
		// 정적 메소드
		System.out.print(Character.toUpperCase('d') + " ");
		System.out.println(Character.toLowerCase('F'));
		System.out.print(Character.getName('@') + ", ");
		System.out.print(Character.getName('|') + ", ");
		System.out.println(Character.getName('^') + " ");
		System.out.print(Character.isDigit('$') + " ");
		System.out.println(Character.isDigit('5'));
	}
}
