package ch8;

public class 데이터타입 {

	public static void main(String[] args) {
		// 기본타입 8개
		// 정수 타입 5개
		/*
		 * * byte char 2byte 16bit 문자용 메모리타입 1글자 저장가능 - 문자라서 양수들로만 이루어짐 short 2byte
		 * 16bit 숫자용 메모리 타입 - 음수부터 양수까지 int 4byte 32bit long 8byte 64bit
		 */

		char x = '카';

		// 실수 float double 2개

		// 논리 boolean 1개
		// 8개 그외에 타입은 참조형(객체)

		/*
		 * 타입변환 데이터 타입을 다른 타입으로 변환 하는것 종류 - 자동 타입 변환 강제 타입 변환 (자동형변환 ,강제형변환)과의 차이
		 * 타입변환이되는것 (안에있는 수가 변화하는것) 강제타입변환시 값은 손실됌 ex
		 */
		int a = 10;
		double b = 2.7;
		double result = a + b;

		System.out.println(a + b);
		System.out.println(a + (int) b);// 강제 타입변환하여 0.7이 날아감 값 손실

	}

}
