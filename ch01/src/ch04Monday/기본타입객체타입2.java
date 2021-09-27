package ch04Monday;

public class 기본타입객체타입2 {

	public static void main(String[] args) {
		// 리터럴로 문자열 생성 스트링은 참조타입이면서 기본타입 리터럴로 문자열생성가능
		String strA = "홍길동";
		String strB = "홍길동";
		if (strA == strB)
			System.out.println("같은 문자열을 참조한다");
		else
			System.out.println("다른 문자열을 참조한다");

		// new String() - 생성자로 문자열 생성 ,new 새로운 문자열 생성
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		if (str1 == str2)
			System.out.println("같은 문자열을 참조한다");
		else
			System.out.println("다른 문자열을 참조한다");
	}

}
