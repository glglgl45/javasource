package ch1;

public class Variable6 {
	public static void main(String[] args) {
		//문자
		char ch1 = 'a';
		char ch2 = 'A';
		char ch3 = '가';
		// ascii 코드 0~127 : 영어, 특수문자 표현가능  
		// A : 65 , a : 97
		// unicode : 전세계 모든 문자에 대해 코드값을 가지고 있음
		// 0~127까지는 ascii 코드값과 동일
		char ch4 = 256; // Ā
		char ch5 = 44032; // unicode 테이블에서 10진수 값
		char ch6 = '\uac00'; //unicode방식
		char ch7 = '가';
		int i = 98;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4); //b
		System.out.println(ch5); //가
		System.out.println(ch6); //가
		System.out.println(ch7); //가
		System.out.println(i); //98

	}
}
