package com.koitt.java.ch07;

public class StringInfo {
	public static void main(String[] args) {
		String snum = "20123458";
		
		// 생성자 오버로딩
		String name = new String("김경석");
		String dept = new String(new char[] {'컴', '퓨', '터', '학', '과'});
		String java = new String("java");
		
		System.out.printf("%d ", snum.compareTo("20123458"));
		System.out.printf("%d %n", snum.compareTo("20123456"));
		System.out.printf("%s ", name);
		System.out.printf("%s ", name.replace('김', '강'));
		System.out.printf("%s %n", name);
		System.out.printf("%s ", dept);
		System.out.printf("%s ", dept.substring(0, 3));
		System.out.printf("%d %n", dept.length());
		System.out.printf("%s ", java.indexOf('a'));
		System.out.printf("%s ", java.concat(" language"));
		System.out.printf("%s ", java.replace('j', 'J'));
		System.out.printf("%s ", java.toUpperCase());
		System.out.printf("%b ", java.equals("JAVA"));
		System.out.printf("%s ", java.equalsIgnoreCase("JAVA"));
		System.out.printf("%s %n", java.substring(1));
	}
}
