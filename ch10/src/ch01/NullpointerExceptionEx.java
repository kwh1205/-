package ch01;

public class NullpointerExceptionEx {
  public static void main(String[] args) {
	//선언된 참조변수가 객체를 참조하지 않을때 NullpointerException 발생
	String str = null;
	//예외처리 구문 try{}catch(){}로 작성
	//System.out.println(str.toString());
	try {
		System.out.println(str.toString());
		//예외발생 가능한 명령문
	}catch(NullPointerException e) {//try{}블러겡서 발생한 예외는 catch(){}블럭에서 처리
		//예외 처리 블럭							//예외처리블럭
		System.out.println(e.toString());//발생한 예외의 내용출력 toString();
		//디버깅용 예외 메시지 출력
		e.printStackTrace();
	}
}
}
