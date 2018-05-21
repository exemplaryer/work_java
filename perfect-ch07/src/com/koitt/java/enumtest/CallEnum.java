package com.koitt.java.enumtest;

import com.koitt.java.enumtest.EnumPerson.Student;

public class CallEnum {
	
	public static void main(String[] args) {
		Student gilDong = EnumPerson.Student.GIL_DONG;
		System.out.println(gilDong.getName());
	}
}
