package ch03;

public class Animal {
	void run() {
		System.out.println("이동합니다");
	}
public static void main(String[] args) {
	Animal a =new Animal();
	Fish f= new Fish();
	Bird b = new Bird();
	Insect i =new Insect();//재정의안함
	a.run();
	f.run();
	b.run();
	i.run();
	
}

}

class Fish extends Animal{
	void run() {
		System.out.println("헤엄을칩니다");
	}
}

class Bird extends Animal{
	void run() {
		System.out.println("날아갑니다");
	}
	
}
class Insect extends Animal{
	
}