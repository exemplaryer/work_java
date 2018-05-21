package com.koitt.java.di;

public class KoittBoard {

	public static void main(String[] args) {
		//KoittDB db = new MySADB();
		KoittDB db = DBFactory.getDB("Ora"); // DI 의존성 주입
		
		db.insert();
		db.remove();
		
		/*MySDB db = new MySDB();
		
		db.add();
		db.remove();*/
	}
}
