package ch04Monday;

public class BreakOutterExample {

	public static void main(String[] args) {
		Labol: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {// char타입 타이핑시 int타입의 아스키코드로 변환
				System.out.println(upper + "-" + lower);
				if (lower == 'g')
					break Labol;
			}

		}
		System.out.println("실행 종료");
	}

}
