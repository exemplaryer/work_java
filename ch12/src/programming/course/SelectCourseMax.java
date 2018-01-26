package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectCourseMax {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306";
			String dbName = "univ";
			
			// 1. 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. 데이터베이스 연결
			Connection conn = DriverManager.getConnection(url + "/" + dbName, "root", "koitt");
			
			
			// 3. SQL문 작성
			String sql = "SELECT * FROM course WHERE maxnum >= 80";
			
			// 4. SQL문 실행을 위한 객체 생성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
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
