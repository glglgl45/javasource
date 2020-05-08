package test;

public class Printer2 {
	// println 오버로딩 메소드
	
	// int string double boolean
	static void println(int num) {
		System.out.println(num);
	}
	static void println(String name) {
		System.out.println(name);
	}
	static void println(double num) {
		System.out.println(num);
	}
	static void println(boolean flag) {
		System.out.println(flag);
	}

}
