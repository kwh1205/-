package ch8;

public class ������Ÿ�� {

	public static void main(String[] args) {
		// �⺻Ÿ�� 8��
		// ���� Ÿ�� 5��
		/*
		 * * byte char 2byte 16bit ���ڿ� �޸�Ÿ�� 1���� ���尡�� - ���ڶ� �����θ� �̷���� short 2byte
		 * 16bit ���ڿ� �޸� Ÿ�� - �������� ������� int 4byte 32bit long 8byte 64bit
		 */

		char x = 'ī';

		// �Ǽ� float double 2��

		// �� boolean 1��
		// 8�� �׿ܿ� Ÿ���� ������(��ü)

		/*
		 * Ÿ�Ժ�ȯ ������ Ÿ���� �ٸ� Ÿ������ ��ȯ �ϴ°� ���� - �ڵ� Ÿ�� ��ȯ ���� Ÿ�� ��ȯ (�ڵ�����ȯ ,��������ȯ)���� ����
		 * Ÿ�Ժ�ȯ�̵Ǵ°� (�ȿ��ִ� ���� ��ȭ�ϴ°�) ����Ÿ�Ժ�ȯ�� ���� �սǉ� ex
		 */
		int a = 10;
		double b = 2.7;
		double result = a + b;

		System.out.println(a + b);
		System.out.println(a + (int) b);// ���� Ÿ�Ժ�ȯ�Ͽ� 0.7�� ���ư� �� �ս�

	}

}
