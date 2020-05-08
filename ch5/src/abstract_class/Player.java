package abstract_class;

public abstract class Player {
	// 자손 클래스에서 추상 메소드를 반드시 구현하도록 강요시킴
	abstract void play(int pos);
	abstract void stop();

}
