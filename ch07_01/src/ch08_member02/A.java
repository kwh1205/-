package ch08_member02;

import ch08_member01.B;
import ch08_member01.B3;
import ch08_member01.B4;
//Ȥ�� import ���ϻ�����Ű��.*�ص���

public class A {
	public void k() {
		B b = new B();
		b.n = 3;
		b.g();
	}

	public void k3() {
		B3 b3 = new B3();
		// Ŭ������ ���ٰ���
		// �޼ҵ�� �ʵ�� �ƹ��͵������� = default�� �ٸ�
		// ��Ű������ ���ٺҰ�

	}

	void f3() {
		B4 b4 = new B4();
		// protected���� ����� �ٸ���Ű������ ���ٺҰ�
		// b4.n=10;
		// b4.g();
	}
}
