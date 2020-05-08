package ore;

public class Pickax {
	public static int stonePick(int level) {
		int dmg = 1;
		Upgrade grade = new Upgrade();
		dmg = dmg * grade.up(level);
		return dmg;
	}
}
