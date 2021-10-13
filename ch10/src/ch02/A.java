package ch02;

public class A {
	void method() {
		try {
		//예외 객체 강제 생성하여 던지는 명령문 Exception=예외객체
		throw new Exception();
		}catch(Exception e) {
			System.out.println("A 예외발생");
		}
}
}
