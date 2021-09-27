package ch04Monday;

public class 반복문break {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		while (true) {
			num++;// 1씩증가
			sum += num;// 누적해서 더하기
			if (num == 50)
				break;// while블럭 빠져나감

		}
		System.out.println("합계:" + sum);
	}
}
