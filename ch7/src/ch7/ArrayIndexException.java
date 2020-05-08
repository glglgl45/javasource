package ch7;

public class ArrayIndexException {
	public static void main(String[] args) {
		// uncheckedException
		// java.lang.ArrayIndexOutOfBoundsException
//		if (args.length==2) {
//			System.out.println(args[0]);
//			System.out.println(args[1]);
//		} else {
//			System.out.println("인자 값을 확인해 주세요");
//		}
		try {
			System.out.println(args[0]);
			System.out.println(args[1]);
		} catch (Exception e) {
			System.out.println("사용법 : java 클래스명 인자1 인자2");
		}
	}
}
