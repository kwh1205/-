package ch04Monday;

public class ForExam2 {

	public static void main(String[] args) {
		// �ʱ�ȭ �κ��̳� �����κп� , �� ��ɹ��� ������ ������
		for (int i = 1, y = 1; true; i++, System.out.println(i)) {
			System.out.println(i + "hello");
			// for���� ���������� ������ �������� ó��{}
			if (i == 10)
				break;// ���ǹ� - ���� ���������� ��ɹ� break;
			y++;
		}
		System.out.println("����");
	}

}
