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
		
		 //1.����̹� �ε�
		 Class.forName(driver);
		 //2.���ᰴü ����
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 //3.������ü ����
		 Statement stmt = con.createStatement();
		 //4.������ �ۼ�
		 //��ȸ ������ ���ڿ��� ���� ���ڿ� ǥ�� ''�� ��� where ���� ������ ���
		 //.[���� 3-17] �ֹ����̺��� Ư�� ���� �ֹ��� ������ �� �Ǹž�, ��հ�, ������, �ְ��� ���Ͻÿ�.
		 //sum(saleprice) as total,
         //avg(saleprice) as average,
         //min(saleprice) as minimum,
         //max(saleprice) as maximum
		 //from orders
		 //where custid =2;
		  System.out.println("��ȸ�� ����ȣ�� �Է��ϼ���>");
		   //title�� sql�� �����ؼ� �Ʒ��� ���� ����� ��� 
		  int price = scanner.nextInt();
		  int custid = price;
		  String sql ="select sum(saleprice) as total,\r\n"
				+ "         avg(saleprice) as average,\r\n"
				+ "         min(saleprice) as minimum,\r\n"
				+ "         max(saleprice) as maximum\r\n"
				+ " from orders"
				+ " where custid="+custid;				;//<--���ӹ� �ۼ�
		
		 System.out.println("������:"+sql);
		
		 //5.������ ���� �� ��� �ޱ�
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.����۾�
		 System.out.println("sum| avg| min| max");
		 System.out.println("---------------------------------");
		 //�Ѱ� �� ��� �ѹ��� rs.next() ȣ��
		 while(rs.next()) {
			 int sum = rs.getInt(1);
			 int avg  = rs.getInt(2);
			 int min = rs.getInt(3);
			 int max =rs.getInt(4);
			 System.out.println(sum+"\t|"+avg+"\t|"+min+"\t|"+max);
		 }
		 //7.�ڿ�����
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }

	}
}
