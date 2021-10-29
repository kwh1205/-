package ch17_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectTest {
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid="madang";
		String pwd ="madang";
		
		//드라이버 로딩
		try {
			//oracle db연결 oracle 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		//DBMS와 연결
		try {
					System.out.println("데이터베이스 연결 준비.......");
					Connection con=DriverManager.getConnection(url, userid, pwd);
					if(con!=null) {
						System.out.println("데이터베이스 연결 성공...");
					}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}