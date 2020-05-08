package ch4;

public class ArrayTest5 {
	public static void main(String[] args) {
		int score[] = new int[5];
		
		// 0,10,20,30,40
		for (int i = 0 ; i < score.length ; i++) {
			score[i] = i * 10;
		}
		
		int sum = 0;
		for (int i : score) {
			System.out.println(i);
			sum += i;
		}
		// 합계
//		for (int i = 0 ; i < score.length ; i++) {
//			sum += score[i];
//		}
		System.out.print("합계 : " + sum);
	}
}
