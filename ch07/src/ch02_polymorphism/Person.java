package ch02_polymorphism;

public class Person {
	public static void main(String[] args) {
		Person p;
		Student s =new Student("ȫ�浿");
		p=s;//promotion(upcasting) - �ڽ�Ŭ������
		//�θ�Ŭ������ ����ȯ
		//���� �θ�Ŭ������ �����ϴ� �ʵ�� ���ٰ���
		System.out.println(p.name);
		//�ڽ�Ŭ�������� �߰��� �޼ҵ�� �θ�Ÿ������ ����ȯ �Ŀ��� ���� �Ұ� 
		//���� �޼ҵ带 �مf���� �������ε��������� �������̵��� ��ü�� ������
		//p.grade="A"
		//p.department="Com"
		//s.grade="A";
		s=(Student)p;//downcasting
		//�������� �ڽ� ������ �ʵ�� �޼ҵ忡 ���ٰ���
		System.out.println(s.name);
		s.grade="A";
		s.department="Com";
	}
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person{
	String grade;
	String department;
	public Student(String name) {
		super(name);
	
	}
}