package ch17_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest16 {
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
		 //박지성이 구매한 도서의 출판사와 같은 출판사에서 구매한 고객들의 이름
		//"select custid, count(*) as 도서수량 --custid의 집계\r\n"
	  	//+ "    from orders -- 전부를포함한 테이블\r\n"
	  	//+ "    where saleprice>=8000 -- where 개별 추출 조건\r\n"
	  	//+ "    group by custid  -- group 대상 \r\n"
	  	//+ "    having count(*)>=2;//<--쿼ㅣ문 작성
		  System.out.println("구매한 고객>");
		  String custName = scanner.next();
		  String sql = " select name "
		  		+ " from customer,orders,book "
		  		+ " where customer.custid = orders.custid "
		  		+ " and orders.bookid = book.bookid "
		  		+ " and publisher in( "
		  		+ " select publisher "
		  		+ " from customer,orders,book"
		  		+ " where customer.custid = orders.custid "
		  		+ " and orders.bookid = book.bookid "
		  		+ " and name like '"+custName+"'"
		  		+"  ) "
		  		+ " and name not like'"+custName+"'";
		 System.out.println("쿼리문:"+sql);
		
		 //5.쿼리문 전송 및 결과 받기
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.출력작업
		 
		 //한건 인 경우 한번만 rs.next() 호출
		 while(rs.next()) {
			 System.out.println("고객명:"+rs.getString(1));
		 }
		 //7.자원해제
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }

	}
}
