package ch03;

public class Outter {
	A a = new A();
//A a = new  A();
	void method() {
	try{a.method();
		//���ܹ߻� �޼ҵ� ȣ���� ������ ��üó��
	}catch(Exception e) {
		System.out.println("A�� �޼ҵ�");
	}
	}
}
