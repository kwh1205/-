package ch02;

public class FileinputStream1 implements AutoCloseable {
	//AytoCloseable 인터페이스는 이클립스에서 기본제공
	private String file;
	
	

	public FileinputStream1(String file) {
		super();
		this.file = file;
	}
	public void read() {
		System.out.println(file+"를읽습니다");
	}

	@Override
	public void close() throws Exception {
		System.out.println(file+"를 닫습니다");
}
}
