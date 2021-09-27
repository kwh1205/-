package ch04Monday;

import java.io.IOException;

//시작과 끝이 명확한 횟수를 알수 있을땐 for문을 사용
public class while문5 {
	public static void main(String[] args) throws IOException {

		boolean run = true;
		int speed = 0;
		int keyCod = 0;
		while (run) {
			if (keyCod != 13 && keyCod != 10) {// enter키가 아니면
				System.out.println("-------------");
				System.out.println("1.증속 | 2.감속 | 3. 중지:");
				System.out.println("-------------");
				System.out.println("선택:");
			}
			keyCod = System.in.read();

			if (keyCod == 49) {// "1"
				speed++;
				System.out.println("현재 속도=" + speed);

			} else if (keyCod == 50) {// "2"
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if (keyCod == 51) {// "3"
				run = false;
			}

		}

	}
}
