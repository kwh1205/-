package ch02_polymorphism;

public class A {
public static void main(String[] args) {
	B b=new B();
	C c=new C();
	D d=new D();
	E e=new E();
	//대입
	
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	B b1 = d;
	C c1 = e;
	
	//불가능 - 상속관계가 아님.
	//B b3=e;
	//C c2=d;
	//처음에 B타입으로 생성 후 부모타입으로 promotion(자동형변환)후
	//다시 원래타입 B로 casting가능 but 캐스팅할시 앞에 대입할타입()넣고하기
	B b4 =(B)a1; 
	//처음부터 부모타입 객체를 자식참조변수에 대입불가
	//B b5 =new A();
	
	//cat은 dog이 될 수없음
	B b6 = new B();
	C c6 = new C();
	//불가능
	A a6 = b6;
	//c6=(c)a6;
}
}

class B extends A{}
class D extends B{}

class C extends A{}
class E extends C{}