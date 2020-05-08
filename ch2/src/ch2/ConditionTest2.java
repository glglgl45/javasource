package ch2;

public class ConditionTest2 {
	public static void main(String[] args) {
		char ch1 = '0';
		// ch1이 영문자(대문자 또는 소문자)이거나 65~122 
		// 숫자일 때만 변수 b의 값이 true가 나오는 프로그램을 작성 48~57
		//boolean b = 조건식
		boolean b = (ch1>='A' && ch1<='Z') || 
					(ch1>='a' && ch1<='z') || 
					(ch1>='0' && ch1<='9') ? true : false; 
		System.out.println(b);
	}
}
