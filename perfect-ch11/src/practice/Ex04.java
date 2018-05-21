package practice;

import java.io.File;

public class Ex04 {
	public static final String PATH = "./";
	
	public static void main(String[] args) {
		
		// 명령행에서 폴더명을 입력받아 File 객체화
		File directory = new File(PATH + args[0]);
		
		// 폴더 생성
		boolean isMake = directory.mkdir();
		if (isMake) {
			System.out.println("폴더가 생성되었습니다.");
		}
		else {
			System.out.println("폴더 생성 실패했습니다.");
		}
	}
}
