package practice;

public class Ex06 {
	public static void main(String[] args) {
		new Thread(new PrimeNumber03(25), "소수 만드는 스레드").start();
		
		//PrimeNumber03 pn = new PrimeNumber03(25);
		Runnable pn = new PrimeNumber03(25);
		
		Thread th = new Thread(pn, "소수 만드는 스레드");
		th.start();
	}
}
