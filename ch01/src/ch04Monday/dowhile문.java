package ch04Monday;

public class dowhile�� {// �ּ� 1ȸ �����Ŀ� ��or�������� �˾ƺ��� �ݺ���
	// while���� �����ϰ�� 1ȸ���������
	// byte,short,char ���� ������ int������ ���� (�ƽ�Ű�ڵ�� ��ȯ a=97)�Ŀ� ���� ����
	// ����ǥ 'a' �̾ȿ� �ִ°͵��� ���꿡 �ƽ�Ű�ڵ尪���� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';

		do {
			System.out.print(c);
			c = (char) (c + 1);
			System.out.println(c);
		} while (c <= 'z');

	}

}
