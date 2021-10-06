package ch07_singleton;

//�̱������� Ŭ���� ����
public class SingleTon {
//1.�ڽ�Ÿ���� static�ʵ� ����
	private static SingleTon instance;

//2.�����ڸ� �ܺο��� ���� ���ϰ� private�� ó��
	private SingleTon() {
	}

	public static SingleTon getInstance() {
		return instance;
	}

}
