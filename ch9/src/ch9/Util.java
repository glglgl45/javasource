package ch9;

public class Util {
	// 타입파라미터 : 리턴타입과 매개변수로 가져야할 타입을 기술하는  것
	public static <T> Box2<T> boxing(T t) {
		Box2<T> box = new Box2<T>();
		box.setItem(t);
		return box;
	}
}
