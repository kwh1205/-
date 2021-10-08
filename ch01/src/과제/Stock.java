package 과제;

import java.text.DecimalFormat;
//컨트롤f키 - find/replace 이름수정

//클래스

public class Stock {
	// 필드
	static final String bankNo = "111";
	static int seq = 0;
	private String ano;
	private String owner;
	private int balance;

	{
		seq++;
		DecimalFormat df = new DecimalFormat("000");//전체 세자리 숫주외 비어있는 부분을 "0"으로 채움
		df.format(seq);
		ano = bankNo + "-" + df.format(seq);//자동으로 번호발급
	}

	// 생성자
public Stock(String ano, String owner, int balance) {
	this.ano = ano;
	this.owner = owner;
	this.balance = balance;
}

public Stock(String owner, int balance) {
	this.owner = owner;
	this.balance = balance;
}

//생성자
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

//Account 정보 출력 메소드
	@Override
	public String toString() {//toString = 아이템 데이타 필드정보 출력용
		return "Account [계좌번호=" + ano + ", 계좌주=" + owner + ", 잔고=" + balance + "]";
	}

}
