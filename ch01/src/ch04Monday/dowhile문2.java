package ch04Monday;

import java.util.Scanner;

public class dowhile��2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = 0;
		do {
			System.out.println("¦���� �Է��ϼ���:");
			num = scanner.nextInt();

		} while (num % 2 != 0);
		System.out.println("����� �Է��� ¦��:" + num);
	}

}
