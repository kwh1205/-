package ch02_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest3 {
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
