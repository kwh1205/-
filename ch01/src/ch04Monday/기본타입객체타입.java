package ch04Monday;

public class 기본타입객체타입 {
//메소드 영역-class 스택영영(변수들어감 str1 - 100번지찾음 null값을넣으면 연결끊김) heap영역 객체("홍길동"-100번지)
	public static void main(String[] args) {
		// 리터럴로 문자열 생성 스트링은 참조타입이면서 기본타입 리터럴로 문자열생성가능
		String str1 = new String("홍길동");
		System.out.println(str1);
		// 출력
		str1 = null;// 널값을넣으면 홍길동이 사라지는게아니고 고아상태로 남음 = 나중에 갈비지콜렉트로 없앰
		System.out.println(str1);

	}

}
