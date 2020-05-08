package poly;

public class Tire {
	private int maxRotation;
	private int accumulatedRotation;
	private String location;
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
	public int getMaxRotation() {
		return maxRotation;
	}
	public int getAccumulatedRotation() {
		return accumulatedRotation;
	}
	public String getLocation() {
		return location;
	}
	public void setMaxRotation(int maxRotation) {
		this.maxRotation = maxRotation;
	}
	public void setAccumulatedRotation(int accumulatedRotation) {
		this.accumulatedRotation = accumulatedRotation;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
