package modifier2;

/* final
 * ○ 클래스 앞에 final 이 붙는 경우 : 상속 금지
 * ○ 인스턴스 변수 앞에 final 이 붙는 경우 : 초기화 후 변경 금지
 * ○ 메소드 앞에 final 이 붙는 경우 : 오버라이딩 금지
 */

public /*final*/ class Person {
	// final로 선언된 인스턴스 변수는 무조건 초기화 필요
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	// 오버라이딩 금지
	final void print() {
		System.out.println("final method()");
	}
	
	void print2() {
		System.out.println("인스턴스 메소드");
	}
}
