package ch8;

public class YypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;

		System.out.println(b + i);// b=127(byte)+100(int) - 127(int)+100(int) �ڵ� Ÿ�Ժ�ȯ - 227(int)
		System.out.println(10 / 4);// 2�� ���� �Ǽ��� �ƴ� ������ �Ἥ int�� ǥ���� ex) 10�̾ƴ� 10.0 Ȥ�� 4.0�����ؾ���
		System.out.println(10.0 / 4);// 2.5���� �Ǽ���� double�� ǥ����
		System.out.println((char) 0x12340041); // A
		System.out.println((byte) (b + i));// -29�� �����µ� ���� byteǥ������ -128~127
		System.out.println((byte) (120 + 8)); // -128 ���� �Ѱ���� �ʰ��� 127���� =128 =127 �̷������� ���ư�
		System.out.println((int) 2.9 + 1.8);
		System.out.println();

	}

}
