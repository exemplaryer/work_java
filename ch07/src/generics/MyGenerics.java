package generics;

public class MyGenerics {
	public static <T> T get(T[] ary, int index) {
		return ary[index];
	}
	
	public static <T> T getLast(T[] ary) {
		return ary[ary.length - 1];
	}
	
	public <T> T test(T value) {
		return value;
	}
	
	public static void main(String[] args) {
		Integer[] n = {3, 4, 5, 7};
		System.out.println(MyGenerics.get(n, 2) + " " + MyGenerics.getLast(n));
		String[] s = {"generics", "type casting", "input", "output"};
		System.out.println(MyGenerics.get(s,  1) + " " + MyGenerics.getLast(s));
		
		MyGenerics g = new MyGenerics();
		Integer test = g.test(10);
		System.out.println(test);
	}
}
