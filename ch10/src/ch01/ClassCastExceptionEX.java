package ch01;

public class ClassCastExceptionEX {

	public static void main(String[] args) {
		try {
		Animal animal = new Cat();
		Cat cat = null;
		System.out.println(cat.toString());
		Dog  dog= (Dog)animal;//예외발생
		System.out.println("형변환 처리");
		//예외발생시 아래 명령문 실행 안함
		}catch(ClassCastException e){
			System.out.println("고양이는 개가될수없슴");
			
		}finally{
			//명령문실행
			System.out.println("프로그램종료");	
		}
		
	}

}
