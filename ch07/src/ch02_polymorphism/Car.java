package ch02_polymorphism;

public class Car {
	//필드 초기화 int i-10;
	//필드의 다형성
	//첫번째 줄과같이 다른클래스를 선언하면서 초기화()-생성자초기화
	//Tire tire = new Tire();//자식 클래스들의 이름으로 바꿔도 상관x
	//자식클래스는 필드와 메소드를 상속받기떄문에 자식으로 필드초기화해도됌
	//Tire tire = new HankookTire();
	Tire tire = new KumhoTire();
}
class Tire{
	void run() {
		
	}
}
class HankookTire extends Tire{}
class KumhoTire extends Tire{}