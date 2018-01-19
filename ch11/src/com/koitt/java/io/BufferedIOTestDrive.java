package com.koitt.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOTestDrive {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("music.mp3");
			fos = new FileOutputStream("music-copy.mp3");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			// 현재 시간을 밀리초로 시작시간으로 저장
			long startTime = System.currentTimeMillis();
			System.out.println("복사 시작 ===");
			
			byte[] buffer = new byte[100];
			while (bis.read(buffer) != -1) {
				bos.write(buffer);
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println("복사 종료 ===");
			
			System.out.println("복사하는데 걸린 시간: " + (endTime - startTime) + "ms");
			
			bos.close();
			bis.close();
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
