package ch7;

public class UnCheckedException {
	public static void main(String[] args) {
		// 런타임에 발생하는 Exception
		try {
			String data = null;
//		System.out.println(data);
			System.out.println(data.toLowerCase());			
		} catch (Exception e) {
			System.out.println("데이터 값을 확인해 주세요");
		}
	}
}
