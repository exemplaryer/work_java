package practice;

import java.io.File;

public class Ex03 {
	public static void main(String[] args) {
		
		// practice 폴더를 객체화
		File parent = new File("src/practice");
		
		// practice 폴더 내부의 파일 혹은 폴더 목록을 제공 (방법 1)
		File[] listFiles = parent.listFiles();
		
		for (int i = 0; i < listFiles.length; i++) {
			File file = listFiles[i];
			
			// File 클래스의 API(메소드)를 이용해서 파일인지 폴더인지 구분
			if (file.isDirectory()) {	// 폴더이면 true
				System.out.println("폴더: " + file.getName());
			}
			else if (file.isFile()) {	// 파일이면 true
				System.out.println("파일: " + file.getName());
			}
		}
		
		// practice 폴더 내부의 파일 혹은 폴더 목록을 제공 (방법 2)
		/*String[] list = parent.list();
		for (int i = 0; i < list.length; i++) {
			String name = list[i];
			
			// practice 폴더내의 파일 혹은 폴더를 객체화
			File file = new File("src/practice/" + name);
			
			// File 클래스의 API(메소드)를 이용해서 파일인지 폴더인지 구분
			if (file.isDirectory()) {	// 폴더이면 true
				System.out.println("폴더: " + name);
			}
			else if (file.isFile()) {	// 파일이면 true
				System.out.println("파일: " + name);
			}
		}*/
	}
}
