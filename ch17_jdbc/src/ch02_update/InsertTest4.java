package ch02_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//�ڹ����α׷��� dbms���� default �ɼ��� autocommit <- commit ��� �������� �ʾƵ� db�� �ڵ� �ݿ�
public class InsertTest4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//1.����̹��ε� 2.���ᰴü���� 
		try {
			 
			Connection con = DaoConnector.getInstance().getConnection();
			//3.������ü����
			Statement stmt = con.createStatement();
			System.out.println("����� ������ �Է��ϼ���");
			String name = scanner.nextLine();
			System.out.println("����� �ּҸ��� �Է��ϼ���");
			String address = scanner.nextLine();
			System.out.println("����� ��ȭ��ȣ�� �Է��ϼ���");
			String phone = scanner.nextLine();
			//4.������ ����
			String sql = "insert into customer(custid,name,address,phone) "
					+ " values((select max(custid)+1 from customer),'"+name+"','"+address+"','"+phone+"')";
		//5-1.���� ���۹� ����ޱ�	
		//executeUpdate(������) ����Ÿ���� int ���Ե� ���� �� ����
			stmt.executeUpdate(sql);
		//5-2 ��� ��ȸ
			sql = "select * from customer order by custid";
		//��ȸ
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
			}
			
			
		}catch (Exception e) {
			
		}
		
		
		//6.�ڿ�����
	}
}
