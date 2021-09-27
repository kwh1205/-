package ch04Monday;

import java.util.Scanner;

public class dowhileÀÀ¿ë°ÔÀÓ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ran = (int) (Math.random() * 100) + 1;// Á¤¼ö ÀÓÀÇ°ª ÀúÀå ¹İº¹¹®¾È¿¡ ¾ø¾î¼­ Ã³À½½ÇÇàÇÒ¶§¸¸ °ª°íÁ¤
		int cnt = 1;// ÀÌ°ÅÀÇ ¿ªÈ°ÀÌ¹¹ÀÓ? ¸î¹ø«‰´ÂÁö ¾Ë·ÁÁÖ´Â°ÅÀÓ
		do {
			System.out.println("1ºÎÅÍ 100±îÁöÀÇ ¼ıÀÚ ÀÔ·Â");
			int num = scanner.nextInt();
			if (num == ran) {
				System.out.println("ÃàÇÏ" + cnt + "¹ø ¸¸¿¡¸Â­Ÿ½¿");
				break;
			} else if (num > ran) {
				System.out.println("¼ıÀÚ°¡ Å­");
			} else {
				System.out.println("¼ıÀÚ°¡ ÀûÀ½");
			}
			cnt++;
		} while (true);

	}

}
