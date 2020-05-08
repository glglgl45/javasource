package inherit;

public class SubListStringEx {
	public static void main(String[] args) {
		SubListString sub = new SubListString();
		
		// 본인 객체의 list메소드가 실행됨
		// => 메소드 재정의시 부모의 메소드는 가려짐
		sub.list();
	}
}
