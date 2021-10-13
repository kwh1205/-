package ch03.copy.copy;

public class OutterMain {
public static void main(String[] args) throws Exception {
	//최종 main메소드는 ㅇㅖ외를 받아서 자체처리하든지
	//떠넘길수 있습니다.(JVM에게)
	Outter out = new Outter();
	//Outter클래스의 필드a의 메소드 호출
	out.method();
	
}
}
