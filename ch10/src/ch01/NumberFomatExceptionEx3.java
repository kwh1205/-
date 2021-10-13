package ch01;

public class NumberFomatExceptionEx3 {
public static void main(String[] args) {
	try {
	int a=Integer.parseInt(null);//String으로 입력받은 값을 숫자로 바꿔줌
		System.out.println(a);
		//예외발생
		a=Integer.parseInt("십");
		System.out.println(a);
	}catch(NumberFormatException e) {
		System.out.println("숫자릅 입력하세요");
	}
		
}
}
