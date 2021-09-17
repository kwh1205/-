package ch06;

public class StringLiteralExam {

	public static void main(String[] args) {

		String str = "Good"; // 내부적으로 아래와 같은 방법으로 객체를 생성함
		// 다르
		String str2 = new String("good"); // string타입 변수를 선언하고 string 이라는 객체를 설정함
		// 다른 int double long 이런것들은 초기화값을 지정해줘야하는데 string은 new를붙혀서해도됌

		System.out.println(str);
		System.out.println(str2);

	}

}
