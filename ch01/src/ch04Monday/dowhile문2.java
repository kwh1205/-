package ch04Monday;

import java.util.Scanner;

public class dowhile문2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = 0;
		do {
			System.out.println("짝수를 입력하세요:");
			num = scanner.nextInt();

		} while (num % 2 != 0);
		System.out.println("당신이 입력한 짝수:" + num);
	}

}
