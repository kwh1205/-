package ch9;

public class IncreaseExam {

	public static void main(String[] args) {
		int x = -1;

		// ���⼭�� ������ x���� ���꿡 ����ϰ�ʹ�.
		if (5 / (x++) == 5) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// ������ x�� ���� ����ϰ� �ʹ�.
		System.out.println(x);
	}

}
