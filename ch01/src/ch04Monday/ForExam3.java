package ch04Monday;

public class ForExam3 {

	public static void main(String[] args) {
		// �ʱ�ȭ �κ��̳� �����κп� , �� ��ɹ��� ������ ������
		int i;
		for (i = 1; i <= 9; i++) {// i�� ���� �ݺ����� ���������� ���1��
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();// ���� ������ ������ ��ɹ�;
		}
		System.out.println("i=" + i);// ?
	}

}
