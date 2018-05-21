package inheritance.abstractinterface;

// 추상 클래스
public abstract class Shape {
	protected double x, y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// 일반 메소드
	public void drawCenter() {
		System.out.println("(x, y) = " + this.x + ", " + this.y);
	}
	
	/*
	 * 메소드 몸체가 없는 이유
	 * - 상속받은 클래스에서 구현을 하라는 뜻
	 */
	public abstract void draw();	// 추상 메소드
	
	public static void main(String[] args) {
		//Shape s = new Shape(3.1, 4.5); // 객체화 오류
		Shape s = new Circle(3.1, 4.5, 3.0);
		s.draw();
	}
}
