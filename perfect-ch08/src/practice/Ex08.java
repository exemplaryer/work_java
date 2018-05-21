package practice;

import java.util.Date;

class Time implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.print(new Date());
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
		}
	}
	
}


public class Ex08 {
	
	public static void main(String[] args) {
		Thread th = new Thread(new Time());
		th.start();
	}
}
