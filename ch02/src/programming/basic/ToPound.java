package programming.basic;

import java.util.Scanner;

public class ToPound {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		System.out.println("무게: " + weight + "kg");
		
		double pound = weight * 2.2;
		System.out.println("무게: " + pound + "lb");
	}
}
