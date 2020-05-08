package ore;

public class testran {

	public static void main(String[] args) {
		int hp = 20;
		hp = (int) (hp + Math.random()*(hp/5)-(hp/5));
		System.out.println(hp);
	}

}
