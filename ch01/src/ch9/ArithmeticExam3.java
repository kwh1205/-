package ch9;

import java.util.Scanner;

public class ArithmeticExam3 {
	public static void main(String[] args) {

		int input = 69;
		Scanner scanner = new Scanner(System.in);
		System.out.println("2�ڸ� ������ �Է��Ͻÿ�:");
		input = scanner.nextInt();

		System.out.println("�����ڸ���:" + (input / 10));
		System.out.println("�����ڸ���:" + (input % 10));

		if (input % 2 == 0) {
			System.out.println("¦���Դϴ�");
		} else {
			System.out.println("Ȧ���Դϴ�");
		}
	}

}
