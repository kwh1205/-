package ch07_fainal;

public class Person {
// final�ʵ�� ����� ���ÿ� �ʱ�ȭ
	final String nation = "korea";
//�����ڿ��� final�ʵ带 �ʱ�ȭ�Ҽ� �ִ� ��� ���� �س��� ���� �߻����� ����
	final String ssn;
	String name;

//�����ڿ� final�ʵ带 �ʱ�ȭ �ϴ� ��ɹ� ����
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}

	public static void main(String[] args) {// ���θ޼ҵ带 �Ϲ�Ŭ�����ȿ� �־ ���x
		Person person = new Person("200010101-12345567", "ȫ�浿");
		// person.nation="usa";
		person.name = "1234";
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
	}
}
