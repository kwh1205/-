package ch02_polymorphism_args;

public class Drive {

  void drive(Vehicle v) {//메소드의 매개변수에 다른클래스넣기가능 //메소드의 매개변수의 다형성
	  //Vehicle 타입으로 넣기위해서 뒤에있는v에 버스 , 트럭 Vehicle가 들어감
	  v.run();
	}
  void drive(Vehicle[] vs) {
	  for(Vehicle v:vs) {
		  v.run();
	  }
	  
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
	  
	  Vehicle[] vehicles = new Vehicle[4];
	  vehicles[0]=v1;
	  vehicles[1]=bus;
	  vehicles[2]=truck;
	  vehicles[3]=bus;
	  
	  drv.drive(vehicles);
	 
  }
  
}

