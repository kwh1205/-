package ch17_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest14 {
	public static void main(String[] args) {
		final String driver ="oracle.jdbc.driver.OracleDriver";
		final String url ="jdbc:oracle:thin:@localhost:1521:xe";
		final String userid="madang";
		final String pwd ="madang";
		Scanner scanner = new Scanner(System.in);
		try {
		
		 //1.드라이버 로딩
		 Class.forName(driver);
		 //2.연결객체 생성
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 //3.쿼리객체 생성
		 Statement stmt = con.createStatement();
		 //4.쿼리문 작성
		 //조회 조건이 문자열인 경우는 문자열 표시 ''로 묶어서 where 조건 값으로 사용
		 //.[질의 3-17] 주문테이블의 특정 고객이 주문한 도서의 총 판매액, 평균값, 최저가, 최고가를 구하시오.
		 //sum(saleprice) as total,
         //avg(saleprice) as average,
         //min(saleprice) as minimum,
         //max(saleprice) as maximum
		 //from orders
		 //where custid =2;
		  System.out.println("조회할 고객번호를 입력하세요>");
		   //title과 sql을 조합해서 아래와 같이 만들고 출력 
		  int price = scanner.nextInt();
		  int custid = price;
		  String sql ="select sum(saleprice) as total,\r\n"
				+ "         avg(saleprice) as average,\r\n"
				+ "         min(saleprice) as minimum,\r\n"
				+ "         max(saleprice) as maximum\r\n"
				+ " from orders"
				+ " where custid="+custid;				;//<--쿼ㅣ문 작성
		
		 System.out.println("쿼리문:"+sql);
		
		 //5.쿼리문 전송 및 결과 받기
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.출력작업
		 System.out.println("sum| avg| min| max");
		 System.out.println("---------------------------------");
		 //한건 인 경우 한번만 rs.next() 호출
		 while(rs.next()) {
			 int sum = rs.getInt(1);
			 int avg  = rs.getInt(2);
			 int min = rs.getInt(3);
			 int max =rs.getInt(4);
			 System.out.println(sum+"\t|"+avg+"\t|"+min+"\t|"+max);
		 }
		 //7.자원해제
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }

	}
}
