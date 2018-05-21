package practice;

public class Account {
	
	private String owner;
	private long balance;
	
	// Alt + Shift + S -> generate getter setter 선택
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	// 7.
	public long deposit(long amount) {
		return this.balance += amount;
	}
	
	public long withdraw(long amount) {
		if (this.balance < amount) {
			System.out.println("인출하려는 금액보다 잔액이 적습니다.");
			return this.balance = 0;
		}
		return this.balance -= amount;
	}
	
	public static void main(String[] args) {
		Account account = new Account("홍길동", 1000000);
		System.out.println("현재 잔액: " + account.deposit(1500000));
		System.out.println("현재 잔액: " + account.withdraw(50000));
	}
}
