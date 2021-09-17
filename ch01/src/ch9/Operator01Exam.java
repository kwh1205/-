package ch9;

public class Operator01Exam {

	public static void main(String[] args) {

		int v1 = 5;
		int v2 = 2;
		System.out.println(v1 + v2);
		System.out.println(v1 - v2);
		System.out.println(v1 * v2);

		// 정수/정수 - 정수의 몫으로 계산 (손실남) int
		System.out.println(v1 / v2);

		// 정수/실수 - 실수 double로 전환 손실x

		// 부등호 %는 나머지값을 구하는것 ex 69/10 - 9 더이상 계산안됌
		// 나머지 계산 - 정수%정수 - 정수타입의 나머지계산
		System.out.println(v1 % v2);// 5=2*2(몫)
		System.out.println(69 / 10);
	}

}
