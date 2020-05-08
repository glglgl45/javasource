package modifier;

public class CarEx {

	public static void main(String[] args) {
		Car car1 = new Car(100);				// public
		Car car2 = new Car(100,"스포티지");		// protected
		Car car3 = new Car(100,"그랜저","중형");	// default
		
		System.out.println(car1 == car2);

	}

}
