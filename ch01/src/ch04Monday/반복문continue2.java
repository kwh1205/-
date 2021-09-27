package ch04Monday;

public class 반복문continue2 {

	public static void main(String[] args) {

		Label: for (int i = 1; i <= 9; i++) {
			System.out.print("i=" + i + "\t");
			for (int j = 0; j <= 9; j++) {
				System.out.print("j=" + j);
				if (j > 2)
					continue Label;// continue는 break와다르게 반복문 전체를 빠져나가는게아닌 다음줄만 제어
				// 즉 밑에 프린트만 제어해서 위로다시올라감 break와 마찬가지로 Label을붙혀서 전체에 적용가능
				System.out.print("출력되나\t");
			}
		}

	}

}
