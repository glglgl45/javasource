package arrays;

import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		int arr[] = {37,21,56,99,88,58,62,15,39,78};
		
		// 정렬 전
		System.out.println(Arrays.toString(arr));
		
		// 정렬(오름차순)
		Arrays.sort(arr);
		
		// 정렬 후
		System.out.println(Arrays.toString(arr));
	}
}
