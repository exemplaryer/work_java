package practice;

public class SalaryMan {
	
	int salary = 1000000;
	
	int getAnnualGross() {
		return salary * 12 + salary * 5;
	}
	
	public SalaryMan() {
		
	}
	
	public SalaryMan(int salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}
}
