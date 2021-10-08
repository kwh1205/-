package ����;

import java.text.DecimalFormat;
//��Ʈ��fŰ - find/replace �̸�����

//Ŭ����

public class Stock {
	// �ʵ�
	static final String bankNo = "111";
	static int seq = 0;
	private String ano;
	private String owner;
	private int balance;

	{
		seq++;
		DecimalFormat df = new DecimalFormat("000");//��ü ���ڸ� ���ֿ� ����ִ� �κ��� "0"���� ä��
		df.format(seq);
		ano = bankNo + "-" + df.format(seq);//�ڵ����� ��ȣ�߱�
	}

	// ������
public Stock(String ano, String owner, int balance) {
	this.ano = ano;
	this.owner = owner;
	this.balance = balance;
}

public Stock(String owner, int balance) {
	this.owner = owner;
	this.balance = balance;
}

//������
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

//Account ���� ��� �޼ҵ�
	@Override
	public String toString() {//toString = ������ ����Ÿ �ʵ����� ��¿�
		return "Account [���¹�ȣ=" + ano + ", ������=" + owner + ", �ܰ�=" + balance + "]";
	}

}
