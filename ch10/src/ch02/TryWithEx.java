package ch02;

public class TryWithEx {

	public static void main(String[] args) {
		try(FileinputStream1  fi=
				new FileinputStream1("excel")) {
			fi.read();
			//������ ���ܹ߻�
			throw new Exception();//���ܰ�ü ������ ȣ��
		}catch(Exception e) {
			System.out.println("���� �߻�");
		}
		//finally {fi.close();}
	}

}
