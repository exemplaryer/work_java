package com.koitt.java.ch07;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		List<Object> list = new LinkedList<Object>();
		
		list.add("pascal");
		((LinkedList<Object>)list).addLast(1);
		list.add("java");
		((LinkedList<Object>)list).addLast(3.4);
		((LinkedList<Object>)list).addFirst("algol");
		((LinkedList<Object>)list).addFirst(0.87);
		list.add(3, null);
		((LinkedList<Object>)list).addLast(5.8);
		
		Iterator<Object> it = list.iterator();
		print(it);
		print(((LinkedList<Object>)list).descendingIterator());
		
		// 배열로 반환하여 모든 원소 출력 가능 (for-each)
		for (Object e : list.toArray()) {
			System.out.print(e + " ");
		}
	}

	public static void print(Iterator<Object> it) {
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
}
