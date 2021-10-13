package ch02;

public class TryWithEx {

	public static void main(String[] args) {
		try(FileinputStream1  fi=
				new FileinputStream1("excel")) {
			fi.read();
			//강제로 예외발생
			throw new Exception();//예외객체 생성자 호출
		}catch(Exception e) {
			System.out.println("예외 발생");
		}
		//finally {fi.close();}
	}

}
