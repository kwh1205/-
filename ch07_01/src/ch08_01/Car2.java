package ch08_01;

public class Car2 {
//�ʵ�
	private int speed;
	private boolean stop;
	// private �ʵ忡 �޼ҵ�� ���ٰ����ϰ� get,set���θ���

	public int getSpeed() {
		return speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
		this.speed = speed;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
