package ch02_polymorphism;

public class Car {
	//�ʵ� �ʱ�ȭ int i-10;
	//�ʵ��� ������
	//ù��° �ٰ����� �ٸ�Ŭ������ �����ϸ鼭 �ʱ�ȭ()-�������ʱ�ȭ
	//Tire tire = new Tire();//�ڽ� Ŭ�������� �̸����� �ٲ㵵 ���x
	//�ڽ�Ŭ������ �ʵ�� �޼ҵ带 ��ӹޱ⋚���� �ڽ����� �ʵ��ʱ�ȭ�ص���
	//Tire tire = new HankookTire();
	Tire tire = new KumhoTire();
}
class Tire{
	void run() {
		
	}
}
class HankookTire extends Tire{}
class KumhoTire extends Tire{}