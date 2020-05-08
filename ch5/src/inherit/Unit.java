package inherit;

public class Unit {
	int x,y;
	public void move(int x, int y) {
		System.out.printf("x축으로 %d, y축으로 %d만큼 이동 \n",x,y);
	}
	public void stop() {
		System.out.println("이동 정지");
	}

}
