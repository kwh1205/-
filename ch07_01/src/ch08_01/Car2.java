package ch08_01;

public class Car2 {
//필드
	private int speed;
	private boolean stop;
	// private 필드에 메소드로 접근가능하게 get,set으로만듬

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
