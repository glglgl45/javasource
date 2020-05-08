package ch8;

public class Reverse {
	public static void main(String[] args) {
		String str1 = "AbZquartKho";
		
		//원본
		System.out.println(str1);
		char arr[] = str1.toCharArray();
		char revArr[] = new char[str1.length()];
		
		// 문자열을 거꾸로 출력하기
		for (int i = 0 ; i < str1.length() ; i++) {
			revArr[str1.length()-1-i] = arr[i];
		}
		System.out.println(revArr);
		
		for (int i = str1.length()-1 ; i >= 0 ; i--) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		StringBuffer buffer = new StringBuffer(str1);
		System.out.println(buffer.reverse());
		
	}
}
