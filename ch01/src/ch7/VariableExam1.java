package ch7;

public class VariableExam1 {

	public static void main(String[] args) {

		// main메소드 블럭내에서 선언된 로컬변수
		int var1; // main메소드 블록에서 var1 변수로 선언 초기화값은 안정함

		if (true) {
			// 메인 메소드내의 if블럭에서 선언된 로컬변수
			int var2;
			var1 = 1;// 메인 메소드 내의 if블럭내에서 사용가능 var1=1 이 초기화값만 이유 위쪽 var1에서 초기화값을 설정안함
			var2 = 2;// 자신이 선언된 블럭내에서 사용가능
			int result = var1 + var2;
			System.out.println(result);
		}

		while (true) {
			int var3;
			System.out.println(var1);// 메인에서 선언되고 if블럭에서 값이바뀜 변수
			var3 = 3;
			var1 = 4;// while블럭에서 새로운 값 저장 메소드블럭에서 변수 선언은했지만 초기화값은 지정안함 처음- 초기화 그다음 값변경
			System.out.println(var1 + var3);
			//
			// var2 = 5; = if문에서 선언된 var2 다른 중괄호내에서 사용 불가능
			break;// 반복문을 빠져나가게 하는 명령어

		}
		System.out.println(var1);
		// System.out.println(var2);// var2가 if 블럭안에서 선언됬는데
		// System.out.println(var3);// 출력도 그 범위안에서해야함
	}

}
