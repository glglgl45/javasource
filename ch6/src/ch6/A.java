package ch6;

public interface A {
	String str="";	// 상수필드만 선언 가능
	void print();	// 추상 메소드만 가능하나 java 8버전부터 static or default 키워드가 붙은 메소드까지 가능
	default void test() {}
	static void sum() {}
}
