package ch03;

public class Outter {
	A a = new A();
//A a = new  A();
	void method() {
	try{a.method();
		//예외발생 메소드 호출한 곳에서 자체처리
	}catch(Exception e) {
		System.out.println("A의 메소드");
	}
	}
}
