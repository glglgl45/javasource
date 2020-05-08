package ch8;

public class CharAt3 {

	public static void main(String[] args) {
		String str1 = "자바 프로그래프";
		
		// 문자열에 '프'가 있는지 확인하는 프로그램
		// 프가 들어있다면 몇번째 위치에 있는지 출력
		for (int i = 0 ; i < str1.length() ; i++) {
			if (str1.charAt(i)=='프') {
				System.out.println(i+1+"번째");
			}
		}
	}
}
