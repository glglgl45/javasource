package arrays;

import java.util.Arrays;

public class ArrayEx4 {
	public static void main(String[] args) {
		// ASCII => A(65), a(97)
		String arr[] = {"apple","good","height","piano","arm","any","ape",""};
		
		// 정렬 전
		System.out.println(Arrays.toString(arr));
		
		// 정렬(오름차순)
		Arrays.sort(arr);
		
		// 정렬 후
		System.out.println(Arrays.toString(arr));
	}
}
