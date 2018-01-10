package com.koitt.java.ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();
		
		hm.put("대한민국", "서울");
		hm.put("일본", "동경");
		hm.put("중국", "북경");
		hm.put("태국", "방콕");
		hm.remove("태국");
		hm.put("중국", "북경1");	// 기존 중국 키값을 가지는 값을 갱신해버린다.
		
		System.out.print("키: " + hm.keySet());
		System.out.println(" 값: " + hm.values());
		
		// 1. Iterator 이용
		Iterator<String> keys = hm.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			String value = hm.get(key);
			System.out.println(key + ": " + value);
		}
		
		// 2. for-each문
		for (String key : hm.keySet()) {
			String value = hm.get(key);
			System.out.println(key + ": " + value);
		}
		
		// 3. key값을 알고 있어서 직접 key값을 입력하여 값을 끄집어 낸다.
		String value = hm.get("대한민국");
		System.out.println(value);
	}
}
