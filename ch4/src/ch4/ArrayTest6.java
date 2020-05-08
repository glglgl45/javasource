package ch4;

public class ArrayTest6 {
	public static void main(String[] args) {
		int arr1[] = {95,85,65,75,55,100};
		int sum = 0;
		
		// 배열 요소의 합계와 평균을 출력
//		for (int i = 0 ; i < arr1.length ; i++) {
//			sum += arr1[i];
//		}
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + ((double)sum / arr1.length));
		
		for (int i : arr1) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ((double)sum / arr1.length));
		
		// 배열요소에서 가장 큰 값 출력
		// 가장 작은 값 
		int max = arr1[0];
		int min = arr1[0];
		for (int i : arr1) {
			if (max < i) {
				max = i;
			}
			if (min > i) {
				min = i;
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
