package ch03_abstract;
//1.��ü�����Ұ�
//2.�߻�޼ҵ�� �ڽ�Ŭ�������� �ݵ�� ������ �ؾ���
public abstract class Animal {
	abstract void run();//{}����ΰ�  ���� ����θ� �����ϴ� �޼ҵ� - �߻� �޼ҵ�
	void method() {}//{�����}�� �ִ� �޼ҵ�
public static void main(String[] args) {
	//��ü(��ü)�� ���� �Ҽ� ���� Ŭ���� -abstract
	//Animal a =new Animal();
	Fish f= new Fish();
	Bird b = new Bird();
	Insect i =new Insect();//�����Ǿ���
	//a.run();
	f.run();
	b.run();
	i.run();
	
}

}

class Fish extends Animal{
	void run() {
		System.out.println("�����Ĩ�ϴ�");
	}
}

class Bird extends Animal{
	void run() {
		System.out.println("���ư��ϴ�");
	}
	
}
class Insect extends Animal{
	//�θ�Ŭ������ abstract�̰� abstract�޼ҵ尡 ������ 
	//	�����Ǹ� ���ϸ��������
	void run() {
		System.out.println("���ϴ�");
	}
	
}