package ch07_staticVsnotStatic;

public class StaticVsInstanceMemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A1 {
	// 인스턴스 필드와 메소드
	int field1;

	void method1() {
	}

	// 정적 필드와 메소드
	static int field2;

	static void method2() {
	}

	// 인스턴스 메소드에서 같은 클래스내의 static멤버 , 인스턴스 멤버 모두 접근(호출) 가능
	void method4() {
		this.field1 = 0;// 인스턴스 필드
		field2 = 10;// static 필드
		method1();// 인스턴스 메소드
		method2();// static 메소드
	}

	// static 메소드 내에는 static으로 선언된 멤버(필드와 메소드)만 사용가능.
	static void method3() {
		// field1=0;//인스턴스 필드
		// this.field1=10;//this 키워드 사용불가
		field2 = 10;// static 필드
		// method1();//인스턴스 메소드
		method2();// static 메소드
	}
}