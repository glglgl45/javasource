package ch4;
/* static
 * ○ 인스턴스(객체)를 생성하지 않아도 사용가능
 * ○ 인스턴스 변수 / 인스턴스 메소드 사용 불가
 * ○ 대부분 정적 필드 선언과 동시에 초기화
 */
public class Math2 {
	// 인스턴스 필드
	long a,b;
	// 인스턴스 메소드
	long add() { return a+b;}
	long subtract() { return a-b;}
	long multiply() { return a*b;}
	double divide() { return a/b;}
	
	// 생성자를 통해서 초기화 불가	
	static long c,d;
	
	// 초기화 블록
	static {
		c = 50;
		d = 30;
	}
	
	// 정적(클래스)메소드
	static long add(long c, long d) {
		return c+d;
	}
	static long subtract(long c, long d) {
		return c-d;
	}
}
