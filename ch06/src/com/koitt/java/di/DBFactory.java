package com.koitt.java.di;

public class DBFactory {
	
	public static KoittDB getDB(String type) {
		
		switch (type) {
			case "Ora":
				return new OraDB();
				
			case "MyS":
				return new MySADB();
		}
		
		return null;
	}
}
