package ch9;

public class IncreaseDecreaseOperationExample4 {

	public static void main(String[] args) {

		/* ���� ������ - ����, ++, -- */
		// ��ȣ ������ - +-
		// ���� ������ - ++ -- (������ ���� 1���� ��Ű�ų�(++) 1 ����(--)��Ű�� ������)
		int x = 10;
		int y = 10;
		int z;
		int a;
		int b;

		System.out.println(z = x--);// (�̷��ԵǸ� ������ z�� x���� �״�ΰ��� x�� --����ȿ�������� 9���پ��� ���⼭ ����Ʈ�غ��� z=10 x=9)
		System.out.println(a = --x);// ���ʿ��� ���� x�� 9�� �����Ǿ��� ���� ��ȣ�� �տ��־ �̹����� a�� 9-1�� 8�� ���� x�� 8�̉�
		System.out.println(b = ++y);// ���� y����10�� �ٵ� �տ� ����ȿ���� �پ +1�� 11�̵��� �̰� b���� ���� b=11 y=11

	}

}
