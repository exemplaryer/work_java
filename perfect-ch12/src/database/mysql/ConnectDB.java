package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static void main(String[] args) {
		
		try {
			// JDBC 드라이버의 이름을 지정
			String driverName = "com.mysql.jdbc.Driver";
			
			// JDBC 드라이버 로드
			Class.forName(driverName);
			
			// 접속할 정보인 URL 지정
			String dbURL = "jdbc:mysql://localhost:3306";
			
			// 데이터베이스에 연결
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			System.out.println("MySQL 데이터베이스에 성공적으로 접속했습니다.");
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("MySQL 데이터베이스 접속에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
