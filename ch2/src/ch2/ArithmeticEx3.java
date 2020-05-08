package ch2;

public class ArithmeticEx3 {
	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		// 산술 연산시 저장되는 값이 int가 표현할 수 있는 값의 범위를 넘어가는 경우 
		// 이상한 값이 나올 수 있음. 따라서 변수 선언시 더 큰 타입으로 선언해야 함
		long z = x * y;
		System.out.println(z);	// -727379968
	}
}
