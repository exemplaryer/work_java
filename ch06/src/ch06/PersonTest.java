package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. 사람 3명(객체 3개) 만들기
		/*Person chulsoo = new Person();
		Person yeonghee = new Person();
		Person gildong = new Person();*/
		Person[] persons = new Person[3];
		
		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		// (자기 자신 포함해서 옆사람 정보 작성하기)
		/*chulsoo.name = "철수";
		chulsoo.age = 40;
		chulsoo.address = "서울";
		
		yeonghee.name = "영희";
		yeonghee.age = 38;
		yeonghee.address = "부산";
		
		gildong.name = "길동";
		gildong.age = 19;
		gildong.address = "대전";*/
		/*for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
		}*/
		
		// [2-2] 아래 방법은 객체를 생성 후 각 인스턴스 변수에 접근하여
		// 값을 초기화 한 부분이다.
		// 아래 부분을 2-1에서 작성한 생성자를 이용하여 변경하시오.
		/*persons[0].name = "철수";
		persons[0].age = 40;
		persons[0].address = "서울";*/
		persons[0] = new Person("철수", 40, "서울");
		
		/*persons[1].name = "영희";
		persons[1].age = 38;
		persons[1].address = "부산";*/
		persons[1] = new Person("영희", 38, "부산");
		
		/*persons[2].name = "길동";
		persons[2].age = 19;
		persons[2].address = "대전";*/
		persons[2] = new Person("길동", 19, "대전");
		
		// 3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		/*chulsoo.introduce();
		yeonghee.introduce();
		gildong.introduce();*/
		for (int i = 0; i < persons.length; i++) {
			persons[i].introduce();
		}
		
		// [2-4] 2-3에서 작성한 생성자를 이용하여 "흥민"이라는 이름으로 사람 객체 하나를 생성하세요.
		Person heungMin = new Person("흥민");
		
		
		// [2-5] 2-4 객체를 이용하여 introduce() 메서드를 호출하세요.
		heungMin.introduce();
	}
}
