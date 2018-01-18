package practice;

public class Ex03 {
	
	public static void main(String[] args) {
		
		// 1.
		BankAccount ba = new BankAccount(-100000);
		ba.deposit(100000);
		ba.withdraw(100000);
		
		// 2.
		try {
			ba.withdraw(200000);
			
		} catch (InvalidWithdraw e) {
			System.out.println(e.getMessage());
		}
	}
}
