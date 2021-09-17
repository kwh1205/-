package ch9;

import java.util.Scanner;

public class ArithmeticExam2 {
	public static void main(String[] args) {
		// 숫자를 입력받아서 짝수/홀수
		int input = 10;
		Scanner scanner = new Scanner(System.in);// 스캐너 만드는 방법//중요
		// 값 입력
		System.out.println("정수를 입력하세요:");
		input = scanner.nextInt();// 스캐너 적용)//중요
		//
		if (input % 2 == 0) {// 짝수
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

	}

}
