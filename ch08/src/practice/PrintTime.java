package practice;

import java.util.Date;

// 1.
public class PrintTime implements Runnable {

	// 2.
	private int count;

	// 3.
	public PrintTime(int count) {
		this.count = count;
	}

	// 4.
	@Override
	public void run() {
		for (int i = 0; i < this.count; i++) {
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("순위: " + Thread.currentThread().getPriority()
					+ new Date() + " " + Thread.currentThread().getName());
		}
	}

}
