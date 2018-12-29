package ch06;

class BlockTest {
	static {	// 클래스 초기화 블럭 (JDBC Driver 코드 내용)
		System.out.println("static { }");
	}
	
	{	// 인스턴스 초기화 블럭(모든 생성자 이전에 호출할 내용)
		System.out.println("{ }");
		
		System.out.println("생성자 호출 이전에 실행할 공통 코드");
		System.out.println("공통코드 1");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public BlockTest(String a) {
		System.out.println("생성자2");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
		
		BlockTest bt3 = new BlockTest();		// 첫번째 생성자 호출
		BlockTest bt4 = new BlockTest("Hello");	// 두번째 생성자 호출
	}
}
