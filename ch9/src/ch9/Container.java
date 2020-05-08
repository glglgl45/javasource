package ch9;

public class Container <T> {
	private T obj;
	public T get() {
		return obj;
	}
	public void set(T obj) {
		this.obj = obj;
	}
	
}
