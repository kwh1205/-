package ch8;

public class YypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;

		System.out.println(b + i);// b=127(byte)+100(int) - 127(int)+100(int) 자동 타입변환 - 227(int)
		System.out.println(10 / 4);// 2가 나옴 실수가 아닌 정수로 써서 int로 표현됌 ex) 10이아닌 10.0 혹은 4.0으로해야함
		System.out.println(10.0 / 4);// 2.5나옴 실수사용 double로 표현됌
		System.out.println((char) 0x12340041); // A
		System.out.println((byte) (b + i));// -29가 나오는데 이유 byte표현범위 -128~127
		System.out.println((byte) (120 + 8)); // -128 나옴 한계범위 초과시 127다음 =128 =127 이런식으로 돌아감
		System.out.println((int) 2.9 + 1.8);
		System.out.println();

	}

}
