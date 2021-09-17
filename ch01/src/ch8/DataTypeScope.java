package ch8;

public class DataTypeScope {

	public static void main(String[] args) {
		// WrapperŬ���� - �⺻Ÿ���� Ư���뵵(�����,����)�� ���� Ŭ����
		System.out.println(Integer.MIN_VALUE + "<=int����<=" + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + "<=long����<=" + Long.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE + "<=byte����<=" + Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + "<=short����<=" + Short.MAX_VALUE);

		System.out.println(Float.MIN_VALUE + "<=float����<=" + Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + "<=double����<=" + Double.MAX_VALUE);

		/*-2147483648<=int����<=2147483647
		-9223372036854775808<=long����<=9223372036854775807
		-128<=byte����<=127 (�Ѱ���� �ʰ��� ����Ŭ��)
		-32768<=short����<=32767
		1.4E-45<=float����<=3.4028235E38
		4.9E-324<=double����<=1.7976931348623157E308*/

	}

}
