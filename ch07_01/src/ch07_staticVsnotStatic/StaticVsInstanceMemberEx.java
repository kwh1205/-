package ch07_staticVsnotStatic;

public class StaticVsInstanceMemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A1 {
	// �ν��Ͻ� �ʵ�� �޼ҵ�
	int field1;

	void method1() {
	}

	// ���� �ʵ�� �޼ҵ�
	static int field2;

	static void method2() {
	}

	// �ν��Ͻ� �޼ҵ忡�� ���� Ŭ�������� static��� , �ν��Ͻ� ��� ��� ����(ȣ��) ����
	void method4() {
		this.field1 = 0;// �ν��Ͻ� �ʵ�
		field2 = 10;// static �ʵ�
		method1();// �ν��Ͻ� �޼ҵ�
		method2();// static �޼ҵ�
	}

	// static �޼ҵ� ������ static���� ����� ���(�ʵ�� �޼ҵ�)�� ��밡��.
	static void method3() {
		// field1=0;//�ν��Ͻ� �ʵ�
		// this.field1=10;//this Ű���� ���Ұ�
		field2 = 10;// static �ʵ�
		// method1();//�ν��Ͻ� �޼ҵ�
		method2();// static �޼ҵ�
	}
}