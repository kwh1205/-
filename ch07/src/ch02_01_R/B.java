package ch02_01_R;

import ch02_01_Q.A;

public class B extends A {
void method() {
	//pri=4; // private 다른패키지 접근 불가
	//def=3;// default 다른패키지 접근불가
	pub=1;//protected 상속관계라 접근가능
	pro=2;//public 어느패키지에서나 접근가능
	
}
}
