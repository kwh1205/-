package ch01;

public class NumberFomatExceptionEx2 {
public static void main(String[] args) {
	try {
	int a=Integer.parseInt(null);//String���� �Է¹��� ���� ���ڷ� �ٲ���
		System.out.println(a);
		//���ܹ߻�
		a=Integer.parseInt("��");
		System.out.println(a);
	}catch(NumberFormatException e) {
		System.out.println("���ڸ� �Է��ϼ���");
	}
		
}
}
