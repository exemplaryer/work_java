package com.koitt.java.ch07;

import java.util.Calendar;

public class CalenderTest {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar now2 = Calendar.getInstance();
		
		System.out.println(now.getTime());
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;	// 월 시작이 0
		int date = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(year + "년 " + month + "월 " + date + "일");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
		if (now == now2) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
	}
}
