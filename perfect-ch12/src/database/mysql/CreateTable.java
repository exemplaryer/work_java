package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "myjavadb";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
		String sqlCT = "CREATE TABLE student (" +
				"id VARCHAR(20) NOT NULL, " +
				"name VARCHAR(20) NOT NULL, " +
				"snum INT NOT NULL, " +
				"dept VARCHAR(20) NOT NULL, " +
				"PRIMARY KEY (id)" +
				");";
		
		
		try {
			// 1. JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			// 2. 질의 할 Statement 만들기
			Statement stmt = con.createStatement();
			
			// 3. 데이터베이스 myjavadb에 테이블 student 만들기
			stmt.executeUpdate(sqlCT);
			System.out.println("테이블 student가 생성되었습니다.");
			
			// 데이터베이스 myjavadb의 테이블 student에 레코드 삽입
			stmt.executeUpdate("INSERT INTO student VALUES ('01', '홍길동', 20125678, '전산과학과');");
			stmt.executeUpdate("INSERT INTO student VALUES ('02', '김제동', 20121234, '미생물학과');");
			stmt.executeUpdate("INSERT INTO student VALUES ('03', '김지숙', 20137892, '고고학과');");
			
			System.out.println("테이블 student에 3개의 레코드가 삽입되었습니다.");
			
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
