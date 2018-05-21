package practice;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02 {
	
	public static void main(String[] args) {
		try {
			// Connection Stream
			FileInputStream fis = new FileInputStream("src/practice/Penguins.jpg");
			
			// Chain Stream
			BufferedInputStream bis = new BufferedInputStream(fis); // 파일을 빠르게 읽기 위해 사용
			
			int data;
			while ((data = bis.read()) != -1) {
				System.out.print((char) data);
			}
			
			bis.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
