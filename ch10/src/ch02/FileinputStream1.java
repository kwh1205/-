package ch02;

public class FileinputStream1 implements AutoCloseable {
	//AytoCloseable �������̽��� ��Ŭ�������� �⺻����
	private String file;
	
	

	public FileinputStream1(String file) {
		super();
		this.file = file;
	}
	public void read() {
		System.out.println(file+"���н��ϴ�");
	}

	@Override
	public void close() throws Exception {
		System.out.println(file+"�� �ݽ��ϴ�");
}
}
