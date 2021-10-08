package ch02;

public class Person {
	public static void main(String[] arg) {
		Student s= new Student();
		s.set();
	}
	//필드
	private int weight;//private 멤버접근 - public 메소드로 접근
	int age;
	protected int height;
	public String name;
	
	//메소드
	public int getWeight() {
		return weight;//private 필드는 접근불가
					  //겟셋 메소드로 접근가능하게함
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}


}

 class Student extends Person {
	 public void set() {
		 age=30;
		 name="홍길동";
		 height=175;
		// weight=99;
		 setWeight(99);
	 }

}