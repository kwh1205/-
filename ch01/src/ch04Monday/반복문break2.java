package ch04Monday;

public class �ݺ���break2 {
	public static void main(String[] args) {
		// �� �� �ݺ����� ��ü ������������ �ٱ��� ofr���̳� while�� �տ� Label:�� ǥ���ϰ�,
		// break�� �ڿ� Labelǥ��
		abc: for (int i = 0; i <= 9; i++) {
			System.out.print("i" + i + "\t");
			for (int j = 0; j <= 9; j++) {
				System.out.print("j=" + j + "\t");
				if (j > 3)
					break abc;// ���� for���� ��� // avc�� ǥ�õ� �ٱ��� for���� �ٹ��
			}
			System.out.println();
			;

		}

	}
}
