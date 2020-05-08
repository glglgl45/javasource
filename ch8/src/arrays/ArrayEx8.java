package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx8 {
	public static void main(String[] args) {
		// ASCII => A(65), a(97)
		String arr[] = {"apple","good","height","piano","arm","any","ape",""};
		
		// 정렬 전
		System.out.println(Arrays.toString(arr));
		
		// 정렬(내림차순)
		Arrays.sort(arr,Comparator.reverseOrder());
		
		// 정렬 후
		System.out.println(Arrays.toString(arr));
	}
}
