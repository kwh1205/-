package ch01;

public class MultiCatchEx2 {

	public static void main(String[] args) {
		String[] arr= {"hello","hi","bye"};
		String str = null;
		//�߻��ϴ� ���ܰ�ü ���� catch�� �߰��Ҽ�����
		try {
			System.out.println(arr[3]);//�ε�������
		int a =Integer.parseInt("��");//���ڿ���
			System.out.println(str.toString());//null ����
		}catch(Exception e){//try������ �߻��� ���ܸ� Exception��ü�� ��� ����.
			System.out.println("���� �߻�");
		}/*catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("�ε��� ����");
		}catch(NumberFormatException e){
			System.out.println("������ ����");
		}*/
	
}
}
