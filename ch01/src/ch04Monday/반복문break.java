package ch04Monday;

public class �ݺ���break {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		while (true) {
			num++;// 1������
			sum += num;// �����ؼ� ���ϱ�
			if (num == 50)
				break;// while�� ��������

		}
		System.out.println("�հ�:" + sum);
	}
}
