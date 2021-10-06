package ch08_member02;

import ch08_member01.B;
import ch08_member01.B3;
import ch08_member01.B4;
//혹은 import 제일상위패키지.*해도됌

public class A {
	public void k() {
		B b = new B();
		b.n = 3;
		b.g();
	}

	public void k3() {
		B3 b3 = new B3();
		// 클래스는 접근가능
		// 메소드와 필드는 아무것도안적음 = default라 다른
		// 패키지에서 접근불가

	}

	void f3() {
		B4 b4 = new B4();
		// protected선언 멤버는 다른패키지에서 접근불가
		// b4.n=10;
		// b4.g();
	}
}
