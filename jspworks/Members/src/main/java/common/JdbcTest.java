package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
	
	static String driverClass = "oracle.jdbc.OracleDriver";  //드라이버 이름
	static String url = "jdbc:oracle:thin:@localhost:1521:xe"; //db 경로(위치)
	static String username = "c##mydb";  //user 이름
	static String password = "mydb";     //비밀번호

	public static void main(String[] args) {
		//연결 객체 선언
		Connection conn = null;
		
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("연결 객체 생성: " + conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
