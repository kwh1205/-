package ch01_Object.copy;

//thread,collection,network,file�����
public class Member {
	int sno;

	public Member(int sno) {
		this.sno = sno;
	}

	@Override
	public boolean equals(Object obj) {
		//1.����Ÿ���̸�
		if(obj instanceof Member) {//2.�ʵ尪 ���� ��
			return this.sno==((Member)obj).sno;//3 ����Ÿ�Ծƴϸ� ������ false
		}
		return false;
		//return super.equals(obj);
	}
	
	
}

