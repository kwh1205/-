package ch9;

import java.util.Scanner;

public class ArithmeticExam2 {
	public static void main(String[] args) {
		// ���ڸ� �Է¹޾Ƽ� ¦��/Ȧ��
		int input = 10;
		Scanner scanner = new Scanner(System.in);// ��ĳ�� ����� ���//�߿�
		// �� �Է�
		System.out.println("������ �Է��ϼ���:");
		input = scanner.nextInt();// ��ĳ�� ����)//�߿�
		//
		if (input % 2 == 0) {// ¦��
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}

	}

}
