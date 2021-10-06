package ch07_singleton.copy;

//�̱������� Ŭ���� ����
public class SingleTon_01 {
//1.�ڽ�Ÿ���� static�ʵ� ����
	private static SingleTon_01 instance;

//2.�����ڸ� �ܺο��� ���� ���ϰ� private�� ó��
	private SingleTon_01() {
	}

//3.public �޼ҵ�� �����ϵ��� �޼ҵ� ����
	public static SingleTon_01 getInstance() {
		if (instance == null)
			instance = new SingleTon_01();
		return instance;
	}

}
