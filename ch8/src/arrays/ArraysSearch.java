package arrays;

import java.util.Arrays;

public class ArraysSearch {
	public static void main(String[] args) {
		// 정렬된 상태가 아닌 경우 => 선형검색
		int arr[] = {10,99,18,55,65,35,45};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.binarySearch(arr, 45));
		
		// 배열에 45라는 값이 들어 있는지 확인하고
		// 찾으면 그 찾은 위치를 출력하고
		// 찾지 못하면 검색 값 없음 이라는 메세지 출력
		
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i] == 45) {
				System.out.println(i+1 + "번째 위치");
				break;
			} else if (i == arr.length-1 && arr[arr.length-1] != 45) {
				System.out.println("검색 값 없음");
			}
		}
	}
}
