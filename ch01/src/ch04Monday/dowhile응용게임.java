package ch04Monday;

import java.util.Scanner;

public class dowhile������� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ran = (int) (Math.random() * 100) + 1;// ���� ���ǰ� ���� �ݺ����ȿ� ��� ó�������Ҷ��� ������
		int cnt = 1;// �̰��� ��Ȱ�̹���? ��������� �˷��ִ°���
		do {
			System.out.println("1���� 100������ ���� �Է�");
			int num = scanner.nextInt();
			if (num == ran) {
				System.out.println("����" + cnt + "�� �����­���");
				break;
			} else if (num > ran) {
				System.out.println("���ڰ� ŭ");
			} else {
				System.out.println("���ڰ� ����");
			}
			cnt++;
		} while (true);

	}

}
