package ch17_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest4 {
	public static void main(String[] args) {
		
		try {
			//1.연결드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.로딩된 드라이버로부터 연결객체 생성
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","madang","madang");
													//서비스명(sid) xe ,서버용(sid) orcl , 
			if(con!=null) {
				System.out.println("연결성공");
				
			}else {
				System.out.println("연결실패");
			}
			//3.쿼리문 생성조회
			Statement stmt = con.createStatement();
			//4. 쿼리문 작성 (생성된객체로)
			StringBuffer sb = new StringBuffer();
			sb.append("select bookname,bookid,price,publisher from book order by bookid");
			//5.조회 객체 전달 및 결과 받기
			ResultSet rs=stmt.executeQuery(sb+"");//스트링버퍼타입+스트링해서 스트링으로 표출
			while(rs.next()){//여러건이라 반복문돌림 위에서 추출한 순서대로 번호매김 아니면 그냥 칼럼명으로표기도가능
				int bookid = rs.getInt("bookid");
				String bookname = rs.getString(1);
				String publisher = rs.getString(4);
				int price = rs.getInt(3);
				System.out.println(bookid+"\t"+bookname+"\t"+publisher+"\t"+price);
				}
			//6.자원 해제
			rs.close();
			stmt.close();
			con.close();
			}catch (Exception e) {
			
		}
	}
}
