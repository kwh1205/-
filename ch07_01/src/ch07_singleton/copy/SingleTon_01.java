package ch07_singleton.copy;

//싱글톤으로 클래스 선언
public class SingleTon_01 {
//1.자신타입의 static필드 선언
	private static SingleTon_01 instance;

//2.생성자를 외부에서 접근 못하게 private로 처리
	private SingleTon_01() {
	}

//3.public 메소드로 접근하도록 메소드 선언
	public static SingleTon_01 getInstance() {
		if (instance == null)
			instance = new SingleTon_01();
		return instance;
	}

}
