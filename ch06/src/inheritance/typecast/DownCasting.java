package inheritance.typecast;

public class DownCasting {
	
	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		System.out.println(she.name + " " + she.number);
		//Faculty f = she;			// 컴파일 오류
		//Faculty f1 = (Faculty) she;	// 실행 오류 (Runtime Exception)
		
		Person p = new Staff("김상기", 1187543, "강서대학교", 3456);
		//Staff s = p;
		Staff s = (Staff) p;	// 다운캐스팅
		s.division = "교학처";
		System.out.print(p.name + " " + p.number + " ");
		System.out.print(s.univ + " " + s.number + " ");
		System.out.println(s.division);
		
		Faculty f2 = s;			// 업캐스팅
		Staff s1 = (Staff) f2;	// 다운캐스팅
	}
}
