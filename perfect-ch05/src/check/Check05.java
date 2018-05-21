package check;

public class Check05 {
	
	String name;
	int age;
	
	// 1. 기본생성자
	public Check05() {}
	
	// 2. name
	public Check05(String name) {
		this.name = name;
	}
	
	// 3. age
	public Check05(int age) {
		this.age = age;
	}
	
	// 4. name, age
	public Check05(String name, int age) {
		//this.name = name;
		
		//this(name);
		//this.age = age;
		
		this(age);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}






