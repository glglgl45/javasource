package ch3;

public class ForTest5 {
	public static void main(String[] args) {
		// 1~100까지 숫자 중에서 3의 배수는 더하고 9의 배수는 안더해서 합계 출력
		int sum = 0;
		for (int i = 1 ; i < 101 ; i++) {
			if (i % 9 == 0) {
			} else if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		System.out.println();
		sum = 0;
		//3의 배수이거나 5의 배수의 합 1~100
		for (int i = 1 ; i < 101 ; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
