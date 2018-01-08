package com.koitt.java.ch07;

public class StringBufferInfo {
	public static void main(String[] args) {
		StringBuffer pg = new StringBuffer("Java");	// 용량 16
		
		System.out.println(pg.capacity());
		System.out.println(pg.append(" language"));
		System.out.println(pg.insert(5, "programming "));
		System.out.println(pg.capacity());
		System.out.println(pg);
		System.out.println(pg.replace(0, 4, "Objective-C"));
		System.out.println(pg.substring(0, 9));
		System.out.println(pg);
		System.out.println(pg.charAt(10));
		pg.setCharAt(10, 'D');
		System.out.println(pg);
	}
}
