package ch1;

public class Variable7 {
	public static void main(String[] args) {
		//int 형 타입의 변수를 2개 선언하고 
		int a = 15, b = 20;
		int temp = a; // temp => 15
		a = b;  // a => 20
		b = temp;  // b => 15
		//값을 할당한 후 두개의 값을 서로 바꾼 후
		// 각 변수를 출력하기
		System.out.println("a = "+a+", b = "+b);

	}
}
