package ch8;

public class CharAt2 {
	public static void main(String[] args) {
		String str1 = "Hello! Java";
		char arr[] = new char[str1.length()];
		// String으로 선언된 값을 char 배열에 담고 배열을 출력하기
		for (int i = 0 ; i < str1.length() ; i++) {
			arr[i] = str1.charAt(i);	
			System.out.print(i + ":"+ arr[i] + " ");
		}
		for (char ch : arr) {
			System.out.print(ch);
		}
	}
}
