package ch03.copy;

public class Outter {
	A a = new A();
//A a = new  A();
	void method() throws Exception {
	a.method();
	//예외발생 메소드 호출한곳에서
	//이 메소드를 호출한 곳으로 떠넘기기
	}
}
