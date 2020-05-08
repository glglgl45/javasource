package ch8;

import java.util.Arrays;

public class FindKim {

	public static void main(String[] args) {
		String names[] = {"Queen","Tod","Kim","Park","Choi"};
		System.out.println(findKim(names));

	}
	public static String findKim(String names[]) {
		// 넘겨받은 배열에서 Kim 이라는 문자열의 위치를 찾아
		// Kim 은 3번째 위치에 있다 라는 문자열을 리턴하는
		// 메소드 작성하기
//		for (int i = 0 ; i < names.length ; i++) {
//			if (names[i].equals("Kim")) {
//				return names[i] + "은 " + (i+1) + "번째 위치에 있다";
//			}
//		}
//		return null;
		int pos = 0;
		pos = Arrays.asList(names).indexOf("Kim");
		return "Kim 은 " + (pos+1) + " 번째 위치에 있다.";
	}

}
