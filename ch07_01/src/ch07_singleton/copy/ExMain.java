package ch07_singleton.copy;

public class ExMain {

	public static void main(String[] args) {
		// multiton방식 - new 생성자()
		// SingleTon s1 =new SingleTon();
		// SingleTon s1 = SingleTon.instance
		// 클래스명.static메소드호출()
		SingleTon_01 s1 = SingleTon_01.getInstance();
		SingleTon_01 s2 = SingleTon_01.getInstance();

		System.out.println(s1 == s2 ? "같은객체" : "다른객체");
	}

}
