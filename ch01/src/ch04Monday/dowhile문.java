package ch04Monday;

public class dowhile문 {// 최소 1회 실행후에 참or거짓인지 알아보는 반복문
	// while문은 거짓일경우 1회도실행안함
	// byte,short,char 연산 참여식 int값으로 제출 (아스키코드로 변환 a=97)후에 제출 작은
	// 따옴표 'a' 이안에 있는것들은 연산에 아스키코드값으로 생각
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';

		do {
			System.out.print(c);
			c = (char) (c + 1);
			System.out.println(c);
		} while (c <= 'z');

	}

}
