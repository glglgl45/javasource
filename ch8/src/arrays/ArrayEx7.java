package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx7 {
	public static void main(String[] args) {
		// ASCII => A(65), a(97)
		Character arr[] = {'a','J','z','K','g','h','D','d','r','t','a','j','A'};
		
		// 정렬 전
		System.out.println(Arrays.toString(arr));
		
		// 정렬(내림차순)
		Arrays.sort(arr,Comparator.reverseOrder());
		
		// 정렬 후
		System.out.println(Arrays.toString(arr));
	}
}
