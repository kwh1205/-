package ch02_polymorphism_args;

public class Vehicle {
	void run() {
		System.out.println("운송수단이 이동합니다");
	}
}

class Bus extends Vehicle{
	void run() {
		System.out.println("버스가 달립니다");
	}
}
class Truck extends Vehicle{
	void run() {
		System.out.println("트럭이 달립니다");
	}
}