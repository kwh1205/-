package ch01;

public class ClassCastExceptionEX {

	public static void main(String[] args) {
		try {
		Animal animal = new Cat();
		Cat cat = null;
		System.out.println(cat.toString());
		Dog  dog= (Dog)animal;//���ܹ߻�
		System.out.println("����ȯ ó��");
		//���ܹ߻��� �Ʒ� ��ɹ� ���� ����
		}catch(ClassCastException e){
			System.out.println("����̴� �����ɼ�����");
			
		}finally{
			//��ɹ�����
			System.out.println("���α׷�����");	
		}
		
	}

}
