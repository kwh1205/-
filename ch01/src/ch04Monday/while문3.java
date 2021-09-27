package ch04Monday;

import java.io.IOException;

public class while문3 {
	public static void main(String[] args) {

		System.out.println("2~9사이의 숫자를 입력하세요");
		// 키보드로 숫자 0을 누르면 입력되는값은 48 아스키코드값
		try {
			int num = System.in.read() - '0';// 표준입력 스트림 throws를 넣던가 try를 넣어서 오류해결 in
			System.out.println("구구단" + num + "단");
			if (num >= 2 && num <= 9) {
				int i = 1;
				while (i <= 9) {// while블럭을 빠져나가는 조건
					System.out.println(num + "*" + i + "=" + (i * num));
					i++;
				}
			} else {
				System.out.println("2~9까지으이 숫자만 입력하세요");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print(false);
		}

	}
}
