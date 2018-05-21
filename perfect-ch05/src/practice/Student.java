package practice;

public class Student {
	
	private String dept;
	private int studentId;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.dept = "컴퓨터공학";
		s1.studentId = 100;
		
		System.out.println("학과: " + s1.dept + ", 학번: " + s1.studentId);
		
		Student s2 = new Student();
		s2.setDept("연기과");
		s2.setStudentId(200);
		
		System.out.println("학과: " + s2.getDept() + ", 학번: " + s2.getStudentId());
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
