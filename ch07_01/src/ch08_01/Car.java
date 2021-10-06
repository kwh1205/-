package ch08_01;

public class Car {
//필드
	private int speed;
	private boolean stop;

//생성자
//메소드
	public int getSpeed() {// private한 값을 변경할수있게 get가져오는거
		return speed;
	}

	public void setSpeed(int speed) {// private변경 적용할 set
		this.speed = speed;
	}

	public boolean isStop() {
		return stop;

	}

	public void setStop(boolean stop) {
		this.stop = stop;// this는 매개변수의 안에있는 stop이아닌 필드의 stop를 밝히기위함

	}
}
