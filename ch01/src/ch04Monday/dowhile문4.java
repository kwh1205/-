package ch04Monday;

import java.util.Scanner;

public class dowhile문4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1, j = 2;
		do {
			do {
				System.out.println(j + "*" + i + "=" + (i * j + "\t"));
				j++;// 증가

			} while (j <= 9);
			i++;// 증가
			j = 2;// 초기화
			System.out.println();

		} while (i <= 9);

	}

}
