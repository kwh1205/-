package ch04Monday;

/*���� ���� ����� �����ϰ� ��ü ������ ����������
 * NullpointerException ���ܰ� �߻�*/
public class NullpointExceptionExam {

	public static void main(String[] args) {
		int[] intArray = null;// ��ü ���� ���� �����ϰ� ���� ��ü�� ������������
		// Ÿ��[]�� Ÿ������ �迭�� �����Ѵٴ� �ǹ�
		intArray = new int[10];
		// new Ÿ��[]�� �ڹٿ��� �迭�� �����Ѵٴ� �ǹ�
		intArray[0] = 10;// ���α׷� ������ ���� �߻�

		String str = null;// ��ü ���� ���� ���� �ϰ� ���� ��ü�� �������� ����
		str = "hello";// "hello"���ڿ� ��ü ����
		System.out.println("�� ���ڼ�:" + str.length());// ���α׷� ���� �� ���� �߻� - runtime
		// exception

	}

}
