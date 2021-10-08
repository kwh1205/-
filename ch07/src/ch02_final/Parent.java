package ch02_final;

public class Parent {
void method1() {}
//final 메소드 - 자식클래스에서 재정의 불가
final void method2() {System.out.println("hello");}
}

class Child extends Parent{
	//재정의
	void method1() {System.out.println("재정의");}
	//재정의 불가 부모클래스의 메소드에 final붙으면 오버라이딩 불가
	//void method2() {}
}