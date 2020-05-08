package ch2;

public class CompareOperEx1 {
	public static void main(String[] args) {
		// 비교연산자 : 결과는 boolean 타입(true,false)으로 나옴
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		
		char ch1 = 'A';
		char ch2 = 'B';
		int a = 65;	// A(65) a(97)
		System.out.println(ch1 == a);	// true
		System.out.println(ch1 < ch2);	// 'A'(65) < 'B'(66)
		// <=, >=
	}
}
