package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectCourseName {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306";
			String dbName = "univ";
			
			// 1. 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. 데이터베이스 연결
			Connection conn = DriverManager.getConnection(url + "/" + dbName, "root", "koitt");
			
			
			// 3. SQL문 작성
			String sql = "SELECT * FROM course WHERE name LIKE ?";
			
			// 3-1. 표준입력 받기
			System.out.print("강좌 이름을 입력하세요 >> ");
			Scanner input = new Scanner(System.in);
			String name = input.nextLine();
			name = "%" + name + "%";
			input.close();
			
			// 4. SQL문 실행을 위한 객체 생성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);	// 첫번째 물음표에 name 값을 주입
			
			// 5. 질의결과 처리
			ResultSet rs = pstmt.executeQuery();
			System.out.printf("%s\t%s\t%s\t%s\n", "id", "name", "professor", "maxnum");
			while (rs.next()) {
				System.out.printf("%s\t%s\t%s\t%s\n", 
						rs.getInt("id"), rs.getString("name"), rs.getString("professor"),
						rs.getInt("maxnum"));
			}
			
			// 6. 객체 연결 해제
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
