package initialBlock;

public class Init4Ex {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		p1.print();
		p2.print();
		p3.print();
	}

}

class Product {
	// static 필드
	static int cnt;
	// 인스턴스 필드
	int seria1No;
	{// 인스턴스 초기화 블럭 - 중괄호안에있는것
		cnt++;// static 필드 증가
		seria1No = cnt;// 증가된 static필드 값을 객체 생성시 각 인스턴스 변수에 저장
	}

	// 인스턴스 메소드
	void print() {
		System.out.println("제품 번호:" + seria1No);
	}
}