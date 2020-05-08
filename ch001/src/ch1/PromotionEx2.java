package ch1;

public class PromotionEx2 {

	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		int b3 = b1 + b2;	// int 타입보다 작은 타입의 연산식에서는 자동으로 형변환이 됨
		
		short s1 = 15, s2 = 20;
		int s3 = s1 + s2;
		
		int i1 = 25;
		double d1 = 13.5d;
		double result = i1 + d1;
		System.out.println(result);
		int result2 = i1 + (int)d1;
		System.out.println(result2);
		
	}

}
