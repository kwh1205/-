package ch07;

public class Parent {
	public static void main(String[] args) {
		Child child = new Child();
		child.mehtod3();}

	void mehtod1() {}

	void method2() {
		System.out.println("�θ�޼ҵ�");}
}

//���
class Child extends Parent {
	// ������ -�����{}�� �ٽ� ����.
	void method2() {
		System.out.println("�ڽĸ޼ҵ�");
	}// �θ�Ŭ������ sysout�������� �ڽĸ޼ҵ忡�� ���� ������
		// �߰�

	void mehtod3() {
		method2();//����Ŭ�������� �޼ҵ� ȣ�� - ��ü�����ʿ�x
		//�θ�Ŭ������ �޼ҵ� ȣ�� :��������� super.�θ�޼ҵ�()�� ���
		super.method2();//method3�� ����Ŭ���� ���� - method3 �ȿ��ִ�
		//�������̵� �����ǵ� method2 ����, super(�θ�Ŭ���� �޼ҵ�) �Ѵ� ����
	}
}
