package ch06;

class InitTest {
	int x;		// 인스턴스 변수: x의 값은 0
	int y = x;	// 인스턴스 변수: y의 값은 0으로 세팅, x값이 0이므로
	
	void method1() {
		int i = 0;		// 지역변수: 현재 i값은 알수없음
		int j = i;	// 에러. 지역변수를 초기화하지 않고 사용
	}
}
