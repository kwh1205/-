package ch9;

public class IncreaseDecreaseOperationExample3 {

	public static void main(String[] args) {

		/* ���� ������ - ����, ++, -- */
		// ��ȣ ������ - +-
		// ���� ������ - ++ -- (������ ���� 1���� ��Ű�ų�(++) 1 ����(--)��Ű�� ������)
		int x = 10;
		int y = 10;
		int z;

		// �ܵ� ������ �ƴ� �ٸ� ����� �Բ� ����Ǵ� ���
		z = x++;// z�� x(10)++ �������ϴ°� ������ ++�� �ڿ��پ ���� 10�̉�

		z = x++;
		System.out.println(z);// 10
		System.out.println(x);// 11

		// ���� x=11, z=10;
		z = ++x;
		System.out.println(z);// 12 ++�� x���� �տ��־ +���Ȼ��·� ���
		System.out.println(x);// 12 ++ �ε�ȣ ���ʿ��ִ¼��� ������ ++�� __�Ȼ��·γ���

		z = y--;// y=10, z=12
		System.out.println(z);// 10
		System.out.println(y);// 9

		// ���� y=9, z=10;
		z = --y;
		System.out.println(z);// 8
		System.out.println(y);// 8

		int familly = 50;
		familly++;// 51
		++familly;// 52
		System.out.println("�츮���� �ı��� ���" + ((++familly) + 1));// 53
		System.out.println(familly);

	}

}
