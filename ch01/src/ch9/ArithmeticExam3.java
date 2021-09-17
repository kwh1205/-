package ch9;

import java.util.Scanner;

public class ArithmeticExam3 {
	public static void main(String[] args) {

		int input = 69;
		Scanner scanner = new Scanner(System.in);
		System.out.println("2자리 정수를 입력하시오:");
		input = scanner.nextInt();

		System.out.println("십의자리수:" + (input / 10));
		System.out.println("일의자리수:" + (input % 10));

		if (input % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
	}

}
