package ch04Monday;

public class ForExam {

	public static void main(String[] args) {
		// for(�ʱ�ȭ:for���� ���������� ����(true);����){���๮;}

		for (int i = 1; true; i++) {// for ���� ���������� ������ ���°�� , ������ true�� ����= ���ѹݺ�
			System.out.println(i + "hello");
			// for���� ���������� ������ �������� ó��{}
			if (i == 10)
				break;// ���ǹ� - ���� ���������� ��ɹ� break;
		}
		System.out.println("����");
	}

}
