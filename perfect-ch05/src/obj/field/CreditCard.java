package obj.field;

public class CreditCard {
	/*
	 * 접근제한자
	 * - private: 같은 클래스 내에서만 사용가능
	 * - (default): 같은 패키지(폴더) 내에서만 사용가능
	 * - protected: default 범위 + 상속받은 클래스까지 사용가능
	 * - public: 어디든 사용가능
	 */
	private long number;	// 16자리 카드번호
	public String owner;	// 카드 소유자
	
	public static void main(String[] args) {
		CreditCard myCard = new CreditCard();
		
		/*
		 *  클래스의 필드는 자동으로 기본값으로 초기화 된다.
		 *  단, 지역변수 (local variable)는 수동으로 기본값을 초기화 해야한다.
		 */
		System.out.println("기본값: " + myCard.number + ", " + myCard.owner);
		int a = 1;
		if (a == 0) {
			System.out.println("number 같다");
		}
		else {
			System.out.println("number 다르다");
		}
		
		if (myCard.owner == null) {
			System.out.println("owner 같다");
		}
		else {
			System.out.println("owner 다르다");
		}
		
		
		/*
		 * 지역변수는 수동으로 기본값을 초기화 해야한다.
		 */
		String local;	// 지역변수 선언만 하고 초기화를 하지 않은 경우
		//System.out.println(local);	// 에러발생
		
		myCard.number = 3456_7654_8765_5647L;
		myCard.owner = "유 재석";
		System.out.print("카드번호: " + myCard.number);
		System.out.println(", 카드소유자: " + myCard.owner);
		
		if (myCard.number == 3456_7654_8765_5647L) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		if (myCard.owner == "유 재석") {
			System.out.println("owner 같다");
		}
		else {
			System.out.println("owner 다르다");
		}
	}
}
