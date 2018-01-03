package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {
	
	public static void main(String[] args) {
		Car morning = new Car("현대 모닝", 180);
		Owner gildong = new Owner("홍길동", morning);
		gildong.introCar();
		
		Car mini = new Car("BMW 미니 쿠페", 220);
		Owner gilja = new Owner("홍길자", mini);
		gilja.introCar();
	}
}
