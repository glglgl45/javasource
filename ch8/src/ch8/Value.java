package ch8;

public class Value {
	private int value;
	
	public Value(int value) {
		super();
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Value) {
			Value v = (Value)obj;
			
			return this.value == v.value;
		}
		return false;
	}
	
	@Override
	public String toString() {	// 멤버변수의 값을 문자열로 리턴
		return ""+value;
	}
}
