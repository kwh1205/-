package ch04Monday;

public class �ݺ���continue2 {

	public static void main(String[] args) {

		Label: for (int i = 1; i <= 9; i++) {
			System.out.print("i=" + i + "\t");
			for (int j = 0; j <= 9; j++) {
				System.out.print("j=" + j);
				if (j > 2)
					continue Label;// continue�� break�ʹٸ��� �ݺ��� ��ü�� ���������°Ծƴ� �����ٸ� ����
				// �� �ؿ� ����Ʈ�� �����ؼ� ���δٽÿö� break�� ���������� Label�������� ��ü�� ���밡��
				System.out.print("��µǳ�\t");
			}
		}

	}

}
