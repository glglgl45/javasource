package test;

public class Printer {
	// println 오버로딩 메소드
	
	// int string double boolean
	void println(int num) {
		System.out.println(num);
	}
	void println(String name) {
		System.out.println(name);
	}
	void println(double num) {
		System.out.println(num);
	}
	void println(boolean flag) {
		System.out.println(flag);
	}

}
