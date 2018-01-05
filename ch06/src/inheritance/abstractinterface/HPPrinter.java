package inheritance.abstractinterface;

public class HPPrinter extends Device implements Connectable {
	
	// 클래스 Device의 추상 메소드 구현
	public void print() {
		System.out.println("HP 프린터 입니다.");
	}

	// 인터페이스 Connectable의 추상 메소드 구현
	@Override
	public void connect() {
		System.out.println(Connectable.name + ", HP 프린터를 연결 합니다.");
	}
	
}
