package Verify;

import java.util.Scanner;

public class BankAppilcation2 {

	private String ano;
	private String owner;
	private int balance;

	public static void main(String[] args) {
		boolean run =true;
		while(run) {
			System.out.println("=====================================");
			System.out.println("1.°èÁÂ»ý¼º|2.°èÁÂ¸ñ·Ï|3.¿¹±Ý|4.Ãâ±Ý|5.Á¾·æ");
			System.out.println("-------------------------------------");
			System.out.println("¼±ÅÃ>");
			
			int selectNo = scanner.nextInt();
			switch(selectNo) {
			case 1:createAccount
			
			
			
			case 4: withdraw(); break;
			
			case 5: run=false
			}
			
			
			
			
			
			
		}

	}

	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
