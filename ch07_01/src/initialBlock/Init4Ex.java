package initialBlock;

public class Init4Ex {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		p1.print();
		p2.print();
		p3.print();
	}

}

class Product {
	// static �ʵ�
	static int cnt;
	// �ν��Ͻ� �ʵ�
	int seria1No;
	{// �ν��Ͻ� �ʱ�ȭ �� - �߰�ȣ�ȿ��ִ°�
		cnt++;// static �ʵ� ����
		seria1No = cnt;// ������ static�ʵ� ���� ��ü ������ �� �ν��Ͻ� ������ ����
	}

	// �ν��Ͻ� �޼ҵ�
	void print() {
		System.out.println("��ǰ ��ȣ:" + seria1No);
	}
}