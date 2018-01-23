package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MyClass {
	public static void main(String[] args) {
		try {
			// Connection Stream
			FileReader fr = new FileReader("src/practice/MyClass.java");
			FileWriter fw = new FileWriter("src/practice/MyClass.num");
			
			// Chain Stream
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String data;
			for (int i = 1; (data = br.readLine()) != null; i++) {
				bw.write(i + " " + data + "\n");
			}
			
			// 닫을때는 Chain Stream 먼저 닫아준다.
			br.close();
			bw.close();
			fr.close();
			fw.close();
			
		} catch (Exception e) {
			
		}
	}
}
