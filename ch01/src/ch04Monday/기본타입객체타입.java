package ch04Monday;

public class �⺻Ÿ�԰�üŸ�� {
//�޼ҵ� ����-class ���ÿ���(������ str1 - 100����ã�� null���������� �������) heap���� ��ü("ȫ�浿"-100����)
	public static void main(String[] args) {
		// ���ͷ��� ���ڿ� ���� ��Ʈ���� ����Ÿ���̸鼭 �⺻Ÿ�� ���ͷ��� ���ڿ���������
		String str1 = new String("ȫ�浿");
		System.out.println(str1);
		// ���
		str1 = null;// �ΰ��������� ȫ�浿�� ������°Ծƴϰ� ��ƻ��·� ���� = ���߿� �������ݷ�Ʈ�� ����
		System.out.println(str1);

	}

}
