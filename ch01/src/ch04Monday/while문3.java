package ch04Monday;

import java.io.IOException;

public class while��3 {
	public static void main(String[] args) {

		System.out.println("2~9������ ���ڸ� �Է��ϼ���");
		// Ű����� ���� 0�� ������ �ԷµǴ°��� 48 �ƽ�Ű�ڵ尪
		try {
			int num = System.in.read() - '0';// ǥ���Է� ��Ʈ�� throws�� �ִ��� try�� �־ �����ذ� in
			System.out.println("������" + num + "��");
			if (num >= 2 && num <= 9) {
				int i = 1;
				while (i <= 9) {// while���� ���������� ����
					System.out.println(num + "*" + i + "=" + (i * num));
					i++;
				}
			} else {
				System.out.println("2~9�������� ���ڸ� �Է��ϼ���");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print(false);
		}

	}
}
