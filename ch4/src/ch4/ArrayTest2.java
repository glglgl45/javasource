package ch4;

public class ArrayTest2 {
	public static void main(String[] args) {
		// char 타입을 담는 배열 생성
		// 타입 배열명[] = new 타입[숫자]
		char arr1[] = new char[3];	// 빈 문자열('')로 초기화
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
		for (char ch : arr1) {
			System.out.println(ch);
		}
		
		// double 타입을 담는 배열 생성
		double arr2[] = new double[3];	// 0.0으로 초기화
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
//		System.out.println(arr2[2]);
		for (double d : arr2) {
			System.out.println(d);
		}
		
		// boolean 타입 배열 생성
		boolean arr3[] = new boolean[3];	// false로 초기화
//		System.out.println(arr3[0]);
//		System.out.println(arr3[1]);
//		System.out.println(arr3[2]);
		for (boolean b : arr3) {
			System.out.println(b);
		}
		// String 배열 생성
		String arr4[] = new String[3];	// null로 초기화
//		System.out.println(arr4[0]);
//		System.out.println(arr4[1]);
//		System.out.println(arr4[2]);
		for (String str : arr4) {
			System.out.println(str);
		}
	}
}
