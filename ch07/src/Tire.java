
public class Tire {
	int maxRotation;
	int accumulatedRotation;
	String location;
	
	public Tire() {}
	public Tire(String location, int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire ����"+(maxRotation-accumulatedRotation));
			return true;
		}else {
			System.out.println("***"+location+"Ÿ�̾� ��ũ");
			return false;
		}
		
	}
}
