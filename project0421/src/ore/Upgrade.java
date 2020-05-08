package ore;

public class Upgrade {
	public static int up(int level) {
		int mul = 1;
		if (level==1) {
			mul = 1;
		} else if(level==2) {
			mul = 2;
		} else if(level==3) {
			mul = 5;
		} else if(level==4) {
			mul = 20;
		} else {
			mul = 100;
		}
		return mul;
	}
}
