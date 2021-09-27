package ch04Monday;

public class while문2 {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		while (i <= 10) {// while문 조건1개
			sum += i;
			System.out.println(sum + "," + i);
			i++;// 조건1개라서 증감을 나중으로뺴야함

		}
		System.out.println("합계:" + sum + ",i=" + i);
	}
}
