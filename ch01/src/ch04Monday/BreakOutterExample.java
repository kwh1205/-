package ch04Monday;

public class BreakOutterExample {

	public static void main(String[] args) {
		Labol: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {// charŸ�� Ÿ���ν� intŸ���� �ƽ�Ű�ڵ�� ��ȯ
				System.out.println(upper + "-" + lower);
				if (lower == 'g')
					break Labol;
			}

		}
		System.out.println("���� ����");
	}

}
