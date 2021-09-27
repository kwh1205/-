package ch04Monday;

public class while문4 {
	public static void main(String[] args) {

		System.out.println("2~9사이의 숫자를 입력하세요");
		// 키보드로 숫자 0을 누르면 입력되는값은 48 아스키코드값
		int i = 1, j = 2;

		System.out.println("구구단");
		while (i <= 9) {
			while (j <= 9) {// for(int j=2;j<=9;j++)
				System.out.printf("%d*%d =%d\t", j, i, (i * j));
				j++;

			}
			j = 2;// j값 재 초기화 for문은 블럭을 시작할때마다 초기화 되지만
			// while문은 초기화를 별도로 해줘야함
			i++;
			System.out.println();
		}

	}
}
