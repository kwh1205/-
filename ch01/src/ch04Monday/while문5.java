package ch04Monday;

import java.io.IOException;

//���۰� ���� ��Ȯ�� Ƚ���� �˼� ������ for���� ���
public class while��5 {
	public static void main(String[] args) throws IOException {

		boolean run = true;
		int speed = 0;
		int keyCod = 0;
		while (run) {
			if (keyCod != 13 && keyCod != 10) {// enterŰ�� �ƴϸ�
				System.out.println("-------------");
				System.out.println("1.���� | 2.���� | 3. ����:");
				System.out.println("-------------");
				System.out.println("����:");
			}
			keyCod = System.in.read();

			if (keyCod == 49) {// "1"
				speed++;
				System.out.println("���� �ӵ�=" + speed);

			} else if (keyCod == 50) {// "2"
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCod == 51) {// "3"
				run = false;
			}

		}

	}
}
