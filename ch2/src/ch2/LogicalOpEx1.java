package ch2;

public class LogicalOpEx1 {
	public static void main(String[] args) {
		// 논리연산자 : &&(AND), ||(OR), !(NOT)
		int charCode = 'A';

		if ((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자");
		}
		if ((charCode < 48) && !(charCode > 57)) {
			System.out.println("8~9숫자");
		}
		
		int value = 6;
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수");
		}
	}
}
