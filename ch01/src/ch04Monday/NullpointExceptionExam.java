package ch04Monday;

/*참조 변수 선언시 선언만하고 객체 생성을 하지않으면
 * NullpointerException 예외가 발생*/
public class NullpointExceptionExam {

	public static void main(String[] args) {
		int[] intArray = null;// 객체 참조 변수 선언만하고 실제 객체는 생성하지않음
		// 타입[]는 타입으로 배열을 선언한다는 의미
		intArray = new int[10];
		// new 타입[]는 자바에서 배열을 생성한다는 의미
		intArray[0] = 10;// 프로그램 실행중 예외 발생

		String str = null;// 객체 참조 변수 선언만 하고 실제 객체는 생성하지 않음
		str = "hello";// "hello"문자열 객체 생성
		System.out.println("총 문자수:" + str.length());// 프로그램 실행 중 예외 발생 - runtime
		// exception

	}

}
