package ch9;

public class BoxEx2 {
	public static void main(String[] args) {
		// 제네릭스 - 타입안정성 / 타입체크와 형변환 생략이 가능하므로
		Box2<String> box1 = new Box2<String>();
		
		box1.setItem("홍길동");	// box1.setItem(new String("홍길동"))
		System.out.println(box1.getItem());	// (String)box1.getItem();
	}
}
