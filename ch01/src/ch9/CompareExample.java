package ch9;

public class CompareExample {

	public static void main(String[] args) {

		System.out.println(3 < 5);// T
		System.out.println(3 > 5);// F
		System.out.println(1 <= 0);// F
		System.out.println(10 >= 10);// T
		System.out.println(1 == 3);// F
		System.out.println(1 != 3);// T

		System.out.println(!(3 < 5));// F !기호는 피연산자의 논리값을바꿈
		System.out.println((3 < 5) ^ (1 == 1));// T ^ T = F ^연산자는 하나는 true 다른하나가 false일때만 true
		System.out.println((3 > 5) || (1 == 1));// F or T = T ||이 연산자는 or이라는뜻 즉 둘중 하나만 true면 true
		System.out.println((3 < 5) && (1 == 1));// T and T = T &&연산자는 모두가 true일떄만 true

	}

}
