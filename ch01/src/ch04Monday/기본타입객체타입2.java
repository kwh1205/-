package ch04Monday;

public class �⺻Ÿ�԰�üŸ��2 {

	public static void main(String[] args) {
		// ���ͷ��� ���ڿ� ���� ��Ʈ���� ����Ÿ���̸鼭 �⺻Ÿ�� ���ͷ��� ���ڿ���������
		String strA = "ȫ�浿";
		String strB = "ȫ�浿";
		if (strA == strB)
			System.out.println("���� ���ڿ��� �����Ѵ�");
		else
			System.out.println("�ٸ� ���ڿ��� �����Ѵ�");

		// new String() - �����ڷ� ���ڿ� ���� ,new ���ο� ���ڿ� ����
		String str1 = new String("ȫ�浿");
		String str2 = new String("ȫ�浿");
		if (str1 == str2)
			System.out.println("���� ���ڿ��� �����Ѵ�");
		else
			System.out.println("�ٸ� ���ڿ��� �����Ѵ�");
	}

}
