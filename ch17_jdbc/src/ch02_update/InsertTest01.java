package ch02_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTest01 {
	public static void main(String[] args) {
		//1.����̹��ε� 2.���ᰴü���� 3.������ü����
		try {
			 
			Connection con = DaoConnector.getInstance().getConnection();
			Statement stmt = con.createStatement();
		//4.������ ����
			String sql = "insert into book(bookid,bookname,publisher,price) "
					+ " values((select max(bookid)+1 from book),'�౸����','�������ǻ�','30000')";
		//5.���� ���۹� ����ޱ�	
		//executeUpdate(������) ����Ÿ���� int ���Ե� ���� �� ����
			int result = stmt.executeUpdate(sql);
			if(result!=0) {
					System.out.println("�Է¼���");
			}else {
					System.out.println("�Է½���");
			}
			stmt.close();
			con.close();
			
			
		}catch (Exception e) {
			
		}
		
		
		//6.�ڿ�����
	}
}
