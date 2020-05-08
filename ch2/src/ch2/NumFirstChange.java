package ch2;

public class NumFirstChange {
	public static void main(String[] args) {
		// num의 값 중에서 일의 자리를 1로 바꾸는 프로그램 작성
		// 예를들어 num의 값이 333 이라면 331이 된다
		
		int num = 333;
		int result = (num/10)*10+1;
		System.out.println(result);
	}
}
