package com.koitt.java.di;

public class MySADB implements KoittDB {

	// 데이터베이스에 정보를 입력하는 메소드
	public void insert() {
		System.out.println("MySDB에 해당 정보가 입력되었습니다.");
	}

	public void remove() {
		System.out.println("MySDB에 해당 정보가 삭제되었습니다.");
	}
}
