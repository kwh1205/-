package ch7;

public class VariableExam2 {

	public static void main(String[] args) {

		// 1부터 10까지의 합 출력
		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);

		// 계산결과를 저장하거나 값을 자동증가 시키거나 변경된 값을 저장하는 공간 - 변수
		// 1부터 1000까지의 합 출력
		// 변수는 {안에서 사용됌} 변수의 사용범위 메인{}안 if{} for{} while{} 즉 if{}안에있는 변수는 밖으로못나옴 메인도마찬가지
		// 하지만
		// 메인안에있는 변수는 더작은 범위인 for while if 등에 아무렇게나 들어갈수있음 if안에만있는건 다른곳으로 이전불가
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
