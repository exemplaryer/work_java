package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {

	public static void main(String[] args) {
		// 1. 차를 만든다
		Car morning = new Car("현대 모닝", 180);

		// 2. 자동차 배열을 생성한다.
		Car[] cars1 = new Car[1];

		// 3. 자동차 배열에 차를 집어 넣는다.
		cars1[0] = morning;

		// 4. 생성자를 이용해서 자동차 배열을 홍길동에게 집어 넣는다.
		Owner gildong = new Owner("홍길동", cars1);

		// 5. 차량 소개
		gildong.introCar();

		// 1. 차를 만든다
		Car mini = new Car("BMW 미니 쿠페", 220);

		// 2. 자동차 배열을 생성한다.
		Car[] cars2 = new Car[1];

		// 3. 자동차 배열에 차를 집어 넣는다.
		cars2[0] = mini;

		// 4. 생성자를 이용해서 자동차 배열을 홍길동에게 집어 넣는다.
		Owner gilja = new Owner("홍길자", cars2);
		
		// 5. 차량 소개
		gilja.introCar();

		// 4. 차량 3대를 생성하세요.
		Car[] cars = new Car[3];
		cars[0] = new Car("그랜저", 200);
		cars[1] = new Car("스타렉스", 180);
		cars[2] = new Car("티뷰론", 220);

		// 5. 생성한 차량 3대를 홍길동 차량으로 변경하세요.
		gildong.setCar(cars);

		// 6. 변경한 차량을 소개하세요.
		gildong.introCar();
	}
}
