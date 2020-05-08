package ch4;

public class ArrayTest10 {
	public static void main(String[] args) {
		System.out.println(args[0]);	// "10"
		System.out.println(args[1]);	// "20"
		
		// String을 숫자로 변경
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		// int num3 = Integer.parseInt("10a");
		
		System.out.println(num1 + num2);
	}
}
