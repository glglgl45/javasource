package ch3;

public class ForTest7 {
	public static void main(String[] args) {
		// num = 12345
		// num의 각 자릿수 더하기
		// 1+2+3+4+5
		
		int sum = 0;
		for (int num = 12345; num !=0 ; ) {
			sum += num%10;	//5		4	3	2	1
			num = num/10;	//1234	123	12	1	0
		}
		System.out.println("12345 숫자의 각 자릿수의 합 : " + sum);
	}
}
