package ch07_singleton.copy;

public class ExMain {

	public static void main(String[] args) {
		// multiton��� - new ������()
		// SingleTon s1 =new SingleTon();
		// SingleTon s1 = SingleTon.instance
		// Ŭ������.static�޼ҵ�ȣ��()
		SingleTon_01 s1 = SingleTon_01.getInstance();
		SingleTon_01 s2 = SingleTon_01.getInstance();

		System.out.println(s1 == s2 ? "������ü" : "�ٸ���ü");
	}

}
