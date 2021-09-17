package ch9;

import java.util.Scanner;

public class ArithmeticExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time;
		// 키보드로 입력받을 스캐너 객체 생성
		// 타입 변수명 Scanner = 타입 Scanner 타입에는 변수선언할때 new와 뒤쪽에 (System.in)붙히기 - 키보드로 값을
		// 받을려면
		// Scanner은 기본타입이아님 Scanner로 객체를 만드는 과정 - 밑에 콘솔에 원하는 숫자넣고 엔터치면 ~초는 ~시간 ~분 ~초입니다로
		// 계산해줌 - Scanner의 작동
		Scanner scanner = new Scanner(System.in);// 기본타입은 소문자로가능(8가지 int double 등) 그외 타입은 대문자로시작!
		System.out.println("시분초로 출력하기");
		System.out.println("계산할 초를 정수로 입력하세요.");
		time = scanner.nextInt();// netxint는 메소드임 기본타입외 타입에는 이런식으로 뭔가를 붙히는듯?
		// 몫과 나머지
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;

		System.out.println(time + "초는");
		System.out.println(hour + "시간");
		System.out.println(minute + "분");
		System.out.println(second + "초입니다.");

	}

}
