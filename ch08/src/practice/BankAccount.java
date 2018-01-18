package practice;

public class BankAccount {
	// 4.
	private int minBalance;		// 최저잔금
	private int balance;		// 잔금
	
	// 5.
	public BankAccount(int minBalance) {
		this.minBalance = minBalance;
	}
	
	// 6.
	public void deposit(int money) {
		this.balance += money;
	}
	
	// 7.							// 9.
	public void withdraw(int money) throws InvalidWithdraw {
		// 8.
		
		// 요청 금액이 음수이거나
		if (money < 0) {
			throw new InvalidWithdraw("E01: 요청 금액이 음수 입니다.");
		}
		// 최저 잔금 이하로 인출을 요청
		else if (this.balance - money < this.minBalance) {
			throw new InvalidWithdraw("E02: 최저 잔금 이하로 인출을 요청하였습니다.");
		}
		
		this.balance -= money;
	}
	
	
}
