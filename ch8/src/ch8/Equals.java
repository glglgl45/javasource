package ch8;

public class Equals {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "Hello";
		
		// 대소문자를 구별하고 비교
		System.out.println(str1.equals(str2));
		// 대소문자를 구별하지 않고 비교
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
