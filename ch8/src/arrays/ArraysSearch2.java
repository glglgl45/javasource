package arrays;

public class ArraysSearch2 {
	public static void main(String[] args) {
		// 정렬된 상태인 경우 => 선형검색
		int arr[] = {10,18,35,45,55,65,89};
		
		// 배열에 48라는 값이 들어 있는지 확인하고
		// 찾으면 그 찾은 위치를 출력하고
		// 찾지 못하면 검색 값 없음 이라는 메세지 출력
		int key = 48;
		
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i] == key) {
				System.out.println(i+1 + "번째 위치");
				break;
			} else if(arr[i] > key){
				System.out.println("입력값 없음");
				break;
			}
		}
//		int i = 0;
//		while (arr[i] < key) {
//			i++;
//		}
//		if(arr[i] == key) {
//			System.out.println("찾은 위치 : " + (i+1));
//		} else {
//			System.out.println("검색 값 없음");
//		}
		
	}
}
