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
		
		 //1.����̹� �ε�
		 Class.forName(driver);
		 //2.���ᰴü ����
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 //3.������ü ����
		 Statement stmt = con.createStatement();
		 //4.������ �ۼ�
		 //��ȸ ������ ���ڿ��� ���� ���ڿ� ǥ�� ''�� ��� where ���� ������ ���
		 //--[���� 3-20] ������ 8,000�� �̻��� ������ ������ ���� ���Ͽ� ���� 
		//"select custid, count(*) as �������� --custid�� ����\r\n"
	  	//+ "    from orders -- ���θ������� ���̺�\r\n"
	  	//+ "    where saleprice>=8000 -- where ���� ���� ����\r\n"
	  	//+ "    group by custid  -- group ��� \r\n"
	  	//+ "    having count(*)>=2;//<--���ӹ� �ۼ�
		  System.out.println("���� ���� ����>");
		  int minPrice = scanner.nextInt();
		  System.out.println("��ȸ�� ���ű��� �Ǽ�>");
		  int count = scanner.nextInt();
		  String sql = " select custid, count(*) as �������� "
		  		+ " from orders "
		  		+ " where saleprice>= "+minPrice
		  		+ " group by custid "
		  		+ " having count(*)>= "+count
		  		+ " order by custid ";
		 System.out.println("������:"+sql);
		
		 //5.������ ���� �� ��� �ޱ�
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.����۾�
		 System.out.println("sum| avg| min| max");
		 System.out.println("---------------------------------");
		 //�Ѱ� �� ��� �ѹ��� rs.next() ȣ��
		 while(rs.next()) {
			 int custid = rs.getInt(1);
			 int total  = rs.getInt(2);
			 System.out.println(custid+"\t|"+total);
		 }
		 //7.�ڿ�����
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }

	}
}
