package ch02;

public class A {
	void method() {
		try {
		//���� ��ü ���� �����Ͽ� ������ ��ɹ� Exception=���ܰ�ü
		throw new Exception();
		}catch(Exception e) {
			System.out.println("A ���ܹ߻�");
		}
}
}
