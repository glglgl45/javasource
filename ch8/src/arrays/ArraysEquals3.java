package arrays;

import java.util.Arrays;

public class ArraysEquals3 {

	public static void main(String[] args) {
		String str2D[][] = {
				{"aaa","bbb"}, {"AAA","BBB"}
		};
		String str[][] = {
				{"aaa","bbb"}, {"AAA","BBB"}
		};
		
		// 1차원 배열은 equals 사용
		System.out.println(Arrays.equals(str2D,str));
		// 2차원 배열은 deepEquals 사용
		System.out.println(Arrays.deepEquals(str2D, str));
	}

}
