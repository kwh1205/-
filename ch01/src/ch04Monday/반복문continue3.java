package ch04Monday;

import java.util.Scanner;

public class 반복문continue3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 1개를 입력하세요:");
		int sum = 0;
		for (int i = 0; i < 5; i++) {// 반복 횟수로 사용된 i 반복횟수 0부터시작해서 5미만이니 4되면
			// 끝남 0,1,2,3,4 해서 총 5번입력가능
			int n = scanner.nextInt();
			if (n < 0)
				continue;// 음수인 경우 skip
			else// if문이 false일떄 실행
				sum += n;// 양수인 경우 더하기

		}
		System.out.println("양수의 합은:" + sum);
	}

}
