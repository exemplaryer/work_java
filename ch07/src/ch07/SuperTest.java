package ch07;

class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.x = 200;
		c.method();
	}
}

class Parent {
	int x = 10;
	
	// 기본생성자
	Parent() {
		System.out.println("Parent 기본생성자 호출!");
	}
}

class Child extends Parent {
	
	// 기본생성자
	Child() {
		System.out.println("Child 기본생성자 호출!");
	}
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}
