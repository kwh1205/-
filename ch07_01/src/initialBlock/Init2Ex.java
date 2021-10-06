package initialBlock;

public class Init2Ex {

	public static void main(String[] args) {
		// a는 static멤버 클래스명.static필드로 접근 클래스호출x
		for (int i : Init2.a) {
			System.out.println(i);
		}

	}

}

class Init2 {
	static int[] a = new int[5];
	// static 초기화 블럭
	static {
		for (int i = 0; i < a.length; i++) {
			int k = (int) (Math.random() * 10);
			a[i] = k;
		}
	}
}