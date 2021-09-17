package ch9;

public class IncreaseDecreaseOperationExample3 {

	public static void main(String[] args) {

		/* 단항 연산자 - 증감, ++, -- */
		// 부호 연산자 - +-
		// 증감 연산자 - ++ -- (변수의 값을 1증가 시키거나(++) 1 감소(--)시키는 연산자)
		int x = 10;
		int y = 10;
		int z;

		// 단독 연산이 아닌 다른 연산과 함꼐 실행되는 경우
		z = x++;// z는 x(10)++ 이증가하는값 하지만 ++가 뒤에붙어서 먼저 10이됌

		z = x++;
		System.out.println(z);// 10
		System.out.println(x);// 11

		// 현재 x=11, z=10;
		z = ++x;
		System.out.println(z);// 12 ++가 x보다 앞에있어서 +가된상태로 출력됌
		System.out.println(x);// 12 ++ 부등호 뒤쪽에있는수는 무조건 ++나 __된상태로나옴

		z = y--;// y=10, z=12
		System.out.println(z);// 10
		System.out.println(y);// 9

		// 현재 y=9, z=10;
		z = --y;
		System.out.println(z);// 8
		System.out.println(y);// 8

		int familly = 50;
		familly++;// 51
		++familly;// 52
		System.out.println("우리집의 식구는 모두" + ((++familly) + 1));// 53
		System.out.println(familly);

	}

}
