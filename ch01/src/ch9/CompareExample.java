package ch9;

public class CompareExample {

	public static void main(String[] args) {

		System.out.println(3 < 5);// T
		System.out.println(3 > 5);// F
		System.out.println(1 <= 0);// F
		System.out.println(10 >= 10);// T
		System.out.println(1 == 3);// F
		System.out.println(1 != 3);// T

		System.out.println(!(3 < 5));// F !��ȣ�� �ǿ������� �������ٲ�
		System.out.println((3 < 5) ^ (1 == 1));// T ^ T = F ^�����ڴ� �ϳ��� true �ٸ��ϳ��� false�϶��� true
		System.out.println((3 > 5) || (1 == 1));// F or T = T ||�� �����ڴ� or�̶�¶� �� ���� �ϳ��� true�� true
		System.out.println((3 < 5) && (1 == 1));// T and T = T &&�����ڴ� ��ΰ� true�ϋ��� true

	}

}
