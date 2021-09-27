package ch04Monday;

public class while문 {
	public static void main(String[] args) {

		int i = 0;
		// while(조건){실행문;}//{}내엥 증/감 처리
		while (i < 10) {// for문은 조건여러개를 닮 while문은 조건1개
			System.out.println("hello!");
			System.out.println(i);
			i++;// while문은 조건이 false가 될수 있도록 하는 명령문이 블럭내에 추가되야함(true면 무한반복)

		}
	}
}
