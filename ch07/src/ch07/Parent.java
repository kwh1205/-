package ch07;

public class Parent {
	public static void main(String[] args) {
		Child child = new Child();
		child.mehtod3();}

	void mehtod1() {}

	void method2() {
		System.out.println("부모메소드");}
}

//상속
class Child extends Parent {
	// 재정의 -실행부{}를 다시 선언.
	void method2() {
		System.out.println("자식메소드");
	}// 부모클래스는 sysout이있지만 자식메소드에는 없게 재정의
		// 추가

	void mehtod3() {
		method2();//같은클래스내의 메소드 호출 - 객체생성필요x
		//부모클래스의 메소드 호출 :명식적으로 super.부모메소드()를 사용
		super.method2();//method3를 메인클래스 실행 - method3 안에있는
		//오버라이딩 재정의된 method2 실행, super(부모클래스 메소드) 둘다 실행
	}
}
