package ch02_polymorphism_args;

public class Shape {
	public String name;
	public Shape next;
	//�ʵ忡 Ŭ������ �����ص� ��� x
	//������
	public Shape() {next=null;}//������ü�� ����Ű�µ� ��
	//�޼ҵ�
	public void draw() {System.out.println("Shape");}
	public void paint() {draw();}
}
class Line extends Shape{
	public void draw() {System.out.println("Line");}
}
class Rect extends Shape{
	public void draw() {System.out.println("Rect");}
}
class Circle extends Shape{
	public void draw() {System.out.println("circle");
	name="circle";
	super.name="shape";//�θ� �ʵ����� - �������ε�
	super.draw();//�θ� �޼ҵ� ȣ��-�������ε�
	System.out.println(name);
	}
	
	
}