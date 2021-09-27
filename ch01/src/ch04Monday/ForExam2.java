package ch04Monday;

public class ForExam2 {

	public static void main(String[] args) {
		// 초기화 부분이나 증감부분에 , 로 명령문을 나열할 수있음
		for (int i = 1, y = 1; true; i++, System.out.println(i)) {
			System.out.println(i + "hello");
			// for블럭을 빠져나가는 조건을 블럭내에서 처리{}
			if (i == 10)
				break;// 조건문 - 블럭을 빠져나가는 명령문 break;
			y++;
		}
		System.out.println("종료");
	}

}
