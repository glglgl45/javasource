package modifier;

public class Singleton {
	
	private static Singleton singleton;

	private Singleton() {
		super();
	}
		
	static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
