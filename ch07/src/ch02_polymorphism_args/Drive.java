package ch02_polymorphism_args;

public class Drive {

  void drive(Vehicle v) {//메소드의 매개변수에 다른클래스넣기가능
	  v.run();
	}
  
  public static void main(String[] args) {
	  Drive drv = new Drive();
	  Vehicle v1 =new Vehicle();
	  drv.drive(v1);
	  //매개변수의 다형성
	  Bus bus =new Bus();
	  drv.drive(bus);
	  //매개변수의 다형성
	  Truck truck = new Truck();
	  drv.drive(truck);
  }
  
}

