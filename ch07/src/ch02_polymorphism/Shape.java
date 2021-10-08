package ch02_polymorphism;

public class Shape {
	public String name;
	public Shape next;
	//필드에 클래스로 선언해도 상관 x
	//생성자
	public Shape() {next=null;}//다음객체를 가르키는데 씀
	//메소드
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
	super.name="shape";//부모 필드접근 - 정적바인딩
	super.draw();//부모 메소드 호출-정적바인딩
	System.out.println(name);
	}
	
	
}