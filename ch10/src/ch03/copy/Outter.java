package ch03.copy;

public class Outter {
	A a = new A();
//A a = new  A();
	void method() throws Exception {
	a.method();
	//���ܹ߻� �޼ҵ� ȣ���Ѱ�����
	//�� �޼ҵ带 ȣ���� ������ ���ѱ��
	}
}
