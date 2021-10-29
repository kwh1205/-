package ch17_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest15 {
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
		 //--[질의 3-20] 가격이 8,000원 이상인 도서를 구매한 고객에 대하여 고객별 
		//"select custid, count(*) as 도서수량 --custid의 집계\r\n"
	  	//+ "    from orders -- 전부를포함한 테이블\r\n"
	  	//+ "    where saleprice>=8000 -- where 개별 추출 조건\r\n"
	  	//+ "    group by custid  -- group 대상 \r\n"
	  	//+ "    having count(*)>=2;//<--쿼ㅣ문 작성
		  System.out.println("구매 조건 가격>");
		  int minPrice = scanner.nextInt();
		  System.out.println("조회할 구매기준 건수>");
		  int count = scanner.nextInt();
		  String sql = " select custid, count(*) as 도서수량 "
		  		+ " from orders "
		  		+ " where saleprice>= "+minPrice
		  		+ " group by custid "
		  		+ " having count(*)>= "+count
		  		+ " order by custid ";
		 System.out.println("쿼리문:"+sql);
		
		 //5.쿼리문 전송 및 결과 받기
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.출력작업
		 System.out.println("sum| avg| min| max");
		 System.out.println("---------------------------------");
		 //한건 인 경우 한번만 rs.next() 호출
		 while(rs.next()) {
			 int custid = rs.getInt(1);
			 int total  = rs.getInt(2);
			 System.out.println(custid+"\t|"+total);
		 }
		 //7.자원해제
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }

	}
}
