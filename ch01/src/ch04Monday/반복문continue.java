package ch04Monday;

public class 반복문continue {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {// 짝수면 출력 하지않기 -홀수만출력
				continue;// for문이면 i++문으로 바로이동,아래 print(i)문은 실행x
			}
			System.out.println(i);

		}

	}

}
