package inherit;

public class Car {
	int speed;
	public void speedUp() {
		speed += 1;
	}
	public final void stop() {
		System.out.println("차를 멈춤");
	}

}
