package ch7;

public class VariableExam1 {

	public static void main(String[] args) {

		// main�޼ҵ� �������� ����� ���ú���
		int var1; // main�޼ҵ� ��Ͽ��� var1 ������ ���� �ʱ�ȭ���� ������

		if (true) {
			// ���� �޼ҵ峻�� if������ ����� ���ú���
			int var2;
			// var1 = 1;// ���� �޼ҵ� ���� if�������� ��밡�� var1=1 �� �ʱ�ȭ���� ���� ���� var1���� �ʱ�ȭ���� ��������
			var2 = 2;// �ڽ��� ����� �������� ��밡��
			// int result = var1 + var2;
			// System.out.println(result);
		}

		while (true) {
			int var3;
			// System.out.println(var1);// ���ο��� ����ǰ� if������ ���̹ٲ� ����
			// var3 = 3;
			// var1 = 4;// while������ ���ο� �� ���� �޼ҵ������ ���� ������������ �ʱ�ȭ���� �������� ó��- �ʱ�ȭ �״��� ������
			// System.out.println(var1 + var3);
			//
			// var2 = 5; = if������ ����� var2 �ٸ� �߰�ȣ������ ��� �Ұ���
			break;// �ݺ����� ���������� �ϴ� ��ɾ�

		}
		// System.out.println(var1);
		// System.out.println(var2);// var2�� if ���ȿ��� ������µ�
		// System.out.println(var3);// ��µ� �� �����ȿ����ؾ���
	}

}
