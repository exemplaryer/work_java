package check;

public class Check06 {
	double width, height;
	
	public Check06() {
		
	}
	
	public Check06(double width) {
		this.width = width;
	}
	
	public Check06(double width, double height) {
		this(width);
		this.height = height;
	}
	
	public static void main(String[] args) {
		Check06 rc = new Check06();
	}
}
