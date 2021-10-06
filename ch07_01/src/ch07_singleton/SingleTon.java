package ch07_singleton;

//싱글톤으로 클래스 선언
public class SingleTon {
//1.자신타입의 static필드 선언
	private static SingleTon instance;

//2.생성자를 외부에서 접근 못하게 private로 처리
	private SingleTon() {
	}

	public static SingleTon getInstance() {
		return instance;
	}

}
