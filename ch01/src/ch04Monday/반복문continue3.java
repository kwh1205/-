package ch04Monday;

import java.util.Scanner;

public class �ݺ���continue3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 1���� �Է��ϼ���:");
		int sum = 0;
		for (int i = 0; i < 5; i++) {// �ݺ� Ƚ���� ���� i �ݺ�Ƚ�� 0���ͽ����ؼ� 5�̸��̴� 4�Ǹ�
			// ���� 0,1,2,3,4 �ؼ� �� 5���Է°���
			int n = scanner.nextInt();
			if (n < 0)
				continue;// ������ ��� skip
			else// if���� false�ϋ� ����
				sum += n;// ����� ��� ���ϱ�

		}
		System.out.println("����� ����:" + sum);
	}

}
