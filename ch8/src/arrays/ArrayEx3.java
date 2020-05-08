package arrays;

import java.util.Arrays;

public class ArrayEx3 {
	public static void main(String[] args) {
		// ASCII => A(65), a(97)
		char arr[] = {'a','J','z','K','g','h','D','d','r','t','a','j','A'};
		
		// 정렬 전
		System.out.println(Arrays.toString(arr));
		
		// 정렬(오름차순)
		Arrays.sort(arr);
		
		// 정렬 후
		System.out.println(Arrays.toString(arr));
	}
}
