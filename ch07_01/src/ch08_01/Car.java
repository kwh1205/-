package ch08_01;

public class Car {
//�ʵ�
	private int speed;
	private boolean stop;

//������
//�޼ҵ�
	public int getSpeed() {// private�� ���� �����Ҽ��ְ� get�������°�
		return speed;
	}

	public void setSpeed(int speed) {// private���� ������ set
		this.speed = speed;
	}

	public boolean isStop() {
		return stop;

	}

	public void setStop(boolean stop) {
		this.stop = stop;// this�� �Ű������� �ȿ��ִ� stop�̾ƴ� �ʵ��� stop�� ����������

	}
}
