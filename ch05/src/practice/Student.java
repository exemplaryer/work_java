package practice;

public class Student {
	
	String dept;
	int studentId;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.dept = "컴퓨터공학";
		s1.studentId = 100;
		
		System.out.println("학과: " + s1.dept + ", 학번: " + s1.studentId);
	}
}
