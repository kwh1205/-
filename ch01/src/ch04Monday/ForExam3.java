package ch04Monday;

public class ForExam3 {

	public static void main(String[] args) {
		// 초기화 부분이나 증감부분에 , 로 명령문을 나열할 수있음
		int i;
		for (i = 1; i <= 9; i++) {// i는 안의 반복문이 끝날떄까지 계속1임
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();// 한줄 밑으로 내리는 명령문;
		}
		System.out.println("i=" + i);// ?
	}

}
