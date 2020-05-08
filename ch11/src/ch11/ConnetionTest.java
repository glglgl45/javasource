package ch11;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnetionTest {
	public static void main(String[] args) {
		
		try {
			// 드라이버 로드 com.mysql.jdbc.Driver(구버전)
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//							(아이피주소 : 포트번호)
		String url = "jdbc:mysql://localhost:3306/javadb?" + "useSSL=false&serverTimezone=UTC";
		
		String user = "javadb";
		String password = "12345";
		
		// 연결 생성
		try(Connection con = DriverManager.getConnection(url,user,password)) {
			if(con!=null) {
				System.out.println("연결되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
