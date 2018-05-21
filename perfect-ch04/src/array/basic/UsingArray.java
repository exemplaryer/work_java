package array.basic;

public class UsingArray {
	
	public static void main(String[] args) {
		// 참조형 문자열 일차원 배열의 생성
		String[] name = {"C++", "Java", "C#"};
		
		// for each 문으로 이차원 배열 출력
		for (String str : name) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		// 래기드 문자열 이차원 배열의 생성
		String[][] data = {{"홍", "길동"}, {"최", "경", "주"}, {"Tiger", "Woods"}};
		
		// for each 문으로 이차원 배열 출력
		for (String[] ary : data) {
			for (String value : ary) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
		System.out.println("name의 가짜 주소값: " + name);
		System.out.println("data의 가짜 주소값: " + data);
	}
}





