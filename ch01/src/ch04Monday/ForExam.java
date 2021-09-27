package ch04Monday;

public class ForExam {

	public static void main(String[] args) {
		// for(초기화:for블럭을 빠져나가는 조건(true);증감){실행문;}
		for (int i = 1; true; i++) {// for 블럭을 빠져나가는 조건이 true= 무한반복
			System.out.println(i + "hello");
			// for블럭을 빠져나가는 조건을 블럭내에서 처리{}
			if (i == 10)
				break;// 조건문 - 블럭을 빠져나가는 명령문 break;
		}
		System.out.println("종료");
	}

}
