package practice;

import java.util.Date;

class Time implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.print(new Date());
			System.out.print("\b\b\b\b\b\b\b\b\b\b");
		}
	}
	
}


public class Ex08 {
	
	public static void main(String[] args) {
		Thread th = new Thread(new Time());
		th.start();
	}
}
