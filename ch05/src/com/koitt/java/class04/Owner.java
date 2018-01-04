package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {
	
	private String name;	// 차주 이름
	private Car[] car;		// 차주가 소유한 차량
	
	// 생성자
	public Owner(String name, Car[] car) {
		this.name = name;
		this.car = car;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car[] getCar() {
		return car;
	}

	public void setCar(Car[] car) {
		this.car = car;
	}
	
	// 자신의 차량을 소개하는 메소드
	public void introCar() {
		// [주인이름]의 자동차의 브랜드 이름은 [브랜드이름] 이고, 최고속도는 [최고속도]km/h 입니다.
		System.out.print(this.name + "의 자동차의 브랜드 이름은 ");
		for (int i = 0; i < car.length; i++) {
			System.out.print(car[i].getBrandName() + " 이고, 최고속도는 ");
			System.out.println(car[i].getMaxSpeed() + "km/h 입니다.");
		}
	}
}
