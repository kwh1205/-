package ch9;

public class IncreaseDecreaseOperationExample4 {

	public static void main(String[] args) {

		/* 단항 연산자 - 증감, ++, -- */
		// 부호 연산자 - +-
		// 증감 연산자 - ++ -- (변수의 값을 1증가 시키거나(++) 1 감소(--)시키는 연산자)
		int x = 10;
		int y = 10;
		int z;
		int a;
		int b;

		System.out.println(z = x--);// (이렇게되면 변수값 z는 x값이 그대로가고 x는 --증감효과떄문에 9로줄어줌 여기서 프린트해보면 z=10 x=9)
		System.out.println(a = --x);// 위쪽에서 변수 x는 9로 지정되었음 증감 부호가 앞에있어서 이번에는 a도 9-1인 8이 들어가고 x도 8이됌
		System.out.println(b = ++y);// 지금 y값은10임 근데 앞에 증감효과가 붙어서 +1인 11이됐음 이게 b에도 적용 b=11 y=11

	}

}
