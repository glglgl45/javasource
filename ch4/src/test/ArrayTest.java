package test;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		// int형 배열을 선언 후 사용자의 입력에 맞춰 배열을 생성한다.
		// 배열선언
		int arr[] = null;
		// 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 배열의 수를 입력 : ");
		int num = sc.nextInt();
		// 배열 생성
		arr = new int[num];
		
		// 생성된 배열 요소의 초기화를 위해 사용자로부터 값을 입력받고
		for (int i = 0 ; i < num ; i++) {
			System.out.print(i + "번째 배열의 요소를 입력 : ");
			arr[i] = sc.nextInt();
		}
		// 배열 전체 요소를 출력
		for (int i : arr) {
			System.out.print(i + "\t");
		}
	}
}
