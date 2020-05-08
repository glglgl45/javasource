package inherit;

public class UnitEx {
	public static void main(String[] args) {
		Marine marine1 = new Marine();
		marine1.stimpack();
		marine1.move(3, 5);
		marine1.stop();
		
		Tank tank1 = new Tank();
		tank1.move(2, 3);
		tank1.stop();
		tank1.changeMode();
		
		Dropship dropship1 = new Dropship();
		dropship1.move(7, 4);
		dropship1.load();
		dropship1.move(4, 5);
		dropship1.stop();
		dropship1.upload();
	}
}
