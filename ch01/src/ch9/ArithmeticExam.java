package ch9;

import java.util.Scanner;

public class ArithmeticExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time;
		// Ű����� �Է¹��� ��ĳ�� ��ü ����
		// Ÿ�� ������ Scanner = Ÿ�� Scanner Ÿ�Կ��� ���������Ҷ� new�� ���ʿ� (System.in)������ - Ű����� ����
		// ��������
		// Scanner�� �⺻Ÿ���̾ƴ� Scanner�� ��ü�� ����� ���� - �ؿ� �ֿܼ� ���ϴ� ���ڳְ� ����ġ�� ~�ʴ� ~�ð� ~�� ~���Դϴٷ�
		// ������� - Scanner�� �۵�
		Scanner scanner = new Scanner(System.in);// �⺻Ÿ���� �ҹ��ڷΰ���(8���� int double ��) �׿� Ÿ���� �빮�ڷν���!
		System.out.println("�ú��ʷ� ����ϱ�");
		System.out.println("����� �ʸ� ������ �Է��ϼ���.");
		time = scanner.nextInt();// netxint�� �޼ҵ��� �⺻Ÿ�Կ� Ÿ�Կ��� �̷������� ������ �����µ�?
		// ��� ������
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;

		System.out.println(time + "�ʴ�");
		System.out.println(hour + "�ð�");
		System.out.println(minute + "��");
		System.out.println(second + "���Դϴ�.");

	}

}
