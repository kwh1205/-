package ch07_fainal;

public class Person {
// final필드는 선언과 동시에 초기화
	final String nation = "korea";
//생성자에서 final필드를 초기화할수 있는 경우 선언만 해놔도 오류 발생하지 않음
	final String ssn;
	String name;

//생성자에 final필드를 초기화 하는 명령문 포함
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}

	public static void main(String[] args) {// 메인메소드를 일반클래스안에 넣어도 상관x
		Person person = new Person("200010101-12345567", "홍길동");
		// person.nation="usa";
		person.name = "1234";
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
	}
}
