package inheritance.overriding;

public class Faculty extends Person {
	public String univ;	// 소속대학
	public long number;	// 사원번호
	
	public Faculty(String name, long number, String univ, long idNumber) {
		super(name, number);
		this.univ = univ;
		this.number = idNumber;
	}
	
	public long getSNumber() {
		return super.number;	// 주민번호
	}
	
	@Override
	public void printInfo() {
		System.out.print("이름: " + super.name + " 주민번호: " + super.number);
		System.out.println(" 대학: " + this.univ + " 직원번호: " + this.number);
	}
	
	public void printInfoPerson() {
		super.printInfo();
	}
}
