package ch02_polymorphism_args;

public class Vehicle {
	void run() {
		System.out.println("��ۼ����� �̵��մϴ�");
	}
}

class Bus extends Vehicle{
	void run() {
		System.out.println("������ �޸��ϴ�");
	}
}
class Truck extends Vehicle{
	void run() {
		System.out.println("Ʈ���� �޸��ϴ�");
	}
}