package ch03;

public class Animal {
	void run() {
		System.out.println("�̵��մϴ�");
	}
public static void main(String[] args) {
	Animal a =new Animal();
	Fish f= new Fish();
	Bird b = new Bird();
	Insect i =new Insect();//�����Ǿ���
	a.run();
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
	
}