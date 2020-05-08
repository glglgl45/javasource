package ch8;

public class StartWith {
	public static void main(String[] args) {
		String str1 = "java.lang.String";
		
		// 시작하는 문자 비교
		System.out.println(str1.startsWith("java"));
		System.out.println(str1.startsWith("lang"));
		
		System.out.println(str1.endsWith("String"));
		
		String file = "test.txt";
		System.out.println(file.endsWith("txt"));
	}
}
