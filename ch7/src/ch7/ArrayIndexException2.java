package ch7;

public class ArrayIndexException2 {
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
				String data1 = args[0];
				String data2 = args[1];
				
				int value1 = Integer.parseInt(data1);
				int value2 = Integer.parseInt(data2);
		// 다중 catch문
		} catch (NumberFormatException e) {
			System.out.println("인자 값을 확인해 주세요");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("사용법 : java 클래스명 인자1 인자2");
		}
	}
}
