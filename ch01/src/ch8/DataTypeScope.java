package ch8;

public class DataTypeScope {

	public static void main(String[] args) {
		// Wrapper클래스 - 기본타입을 특정용도(값출력,변경)로 만든 클래스
		System.out.println(Integer.MIN_VALUE + "<=int범위<=" + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + "<=long범위<=" + Long.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE + "<=byte범위<=" + Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + "<=short범위<=" + Short.MAX_VALUE);

		System.out.println(Float.MIN_VALUE + "<=float범위<=" + Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + "<=double범위<=" + Double.MAX_VALUE);

		/*-2147483648<=int범위<=2147483647
		-9223372036854775808<=long범위<=9223372036854775807
		-128<=byte범위<=127 (한계범위 초과시 오버클럭)
		-32768<=short범위<=32767
		1.4E-45<=float범위<=3.4028235E38
		4.9E-324<=double범위<=1.7976931348623157E308*/

	}

}
