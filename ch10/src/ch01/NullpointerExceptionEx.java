package ch01;

public class NullpointerExceptionEx {
  public static void main(String[] args) {
	//����� ���������� ��ü�� �������� ������ NullpointerException �߻�
	String str = null;
	//����ó�� ���� try{}catch(){}�� �ۼ�
	//System.out.println(str.toString());
	try {
		System.out.println(str.toString());
		//���ܹ߻� ������ ��ɹ�
	}catch(NullPointerException e) {//try{}���ۼ� �߻��� ���ܴ� catch(){}������ ó��
		//���� ó�� ��							//����ó����
		System.out.println(e.toString());//�߻��� ������ ������� toString();
		//������ ���� �޽��� ���
		e.printStackTrace();
	}
}
}
