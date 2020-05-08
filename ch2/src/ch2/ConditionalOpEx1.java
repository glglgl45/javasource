package ch2;

public class ConditionalOpEx1 {
	public static void main(String[] args) {
		// 삼항연산자 : 조건 ? 참일때 : 거짓일때
		// 조건 : 비교연산자를 주로 사용
		int score = 90;
		char ch = score > 95 ? 'B' : 'A';
		System.out.println(ch);
	}
}
