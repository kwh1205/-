package ch04Monday;

import java.util.Scanner;

public class dowhile��4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1, j = 2;
		do {
			do {
				System.out.println(j + "*" + i + "=" + (i * j + "\t"));
				j++;// ����

			} while (j <= 9);
			i++;// ����
			j = 2;// �ʱ�ȭ
			System.out.println();

		} while (i <= 9);

	}

}
