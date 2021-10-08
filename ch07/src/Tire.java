
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
			System.out.println(location+"Tire 수명"+(maxRotation-accumulatedRotation));
			return true;
		}else {
			System.out.println("***"+location+"타이어 펑크");
			return false;
		}
		
	}
}
