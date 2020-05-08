package ch4;

public class MemberCall {
	// 인스턴스 변수, 필드, 멤버변수 ...
	int iv = 10;
	// 정적변수, 정적필드, 클래스변수 ...
	static int cv = 20;
	// static int cv2 = iv; (X)
	static int cv2 = new MemberCall().iv;
	
	// static 메소드 안에서는 인스턴스 변수 사용불가
	static void staticMethod1 () {
		System.out.println(cv);
		System.out.println(cv2);
		// System.out.println(iv) (X)
	}
	
	// static 메소드 안에서는 인스턴스 메소드 사용불가
	static void staticMethod2() {
		staticMethod1();
		// instanceMethod1(); (X)
	}
	
	// 인스턴스메소드 안에서는 인스턴스변수 사용가능
	// 클래스 변수 사용가능
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
}
