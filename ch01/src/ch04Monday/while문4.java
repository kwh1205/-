package ch04Monday;

//���۰� ���� ��Ȯ�� Ƚ���� �˼� ������ for���� ���
public class while��4 {
	public static void main(String[] args) {

		System.out.println("2~9������ ���ڸ� �Է��ϼ���");
		// Ű����� ���� 0�� ������ �ԷµǴ°��� 48 �ƽ�Ű�ڵ尪
		int i = 1, j = 2;

		System.out.println("������");
		while (i <= 9) {
			//
			while (j <= 9) {// for(int j=2;j<=9;j++)
				System.out.printf("%d*%d =%d\t", j, i, (i * j));
				j++;

			}
			j = 2;// j�� �� �ʱ�ȭ for���� ���� �����Ҷ����� �ʱ�ȭ ������
			// while���� �ʱ�ȭ�� ������ �������
			i++;// ���� ó��
			System.out.println();
		}

	}
}
