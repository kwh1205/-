package ch17_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest5 {
	public static void main(String[] args) {
		 try {
			 //1.드라이버 로딩
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 //2.연결객체 생성
			 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					                                          "madang", "madang");
			 if(con!=null) {
					System.out.println("연결성공");
					
				}else {
					System.out.println("연결실패");
				}
			 //3.쿼리객체 생성
			 Statement stmt = con.createStatement();
			 //4.쿼리문 작성
			 //조회 조건이 숫자인 경우는 숫자로 where조건 값으로 바로 사용
			 String sql ="select bookid, bookname, publisher, price from book where bookid=1";
			 //5.쿼리문 전송 및 결과 받기
			 ResultSet rs = stmt.executeQuery(sql);
			 //6.출력작업
			 System.out.println("bookid| bookname| publisher| price");
			 System.out.println("---------------------------------");
			 if(rs.next()) {//한건이라서 if문으로 여러건일때 while문
				 int bookid = rs.getInt(1);
				 String bookname = rs.getString(2);
				 String publisher = rs.getString(3);
				 int price =rs.getInt(4);
				 System.out.println(bookid+"|"+bookname+"\t|"+publisher+"\t|"+price);
			 }
			 //7.자원해제
			 rs.close();    stmt.close();   con.close();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }

		}
	}