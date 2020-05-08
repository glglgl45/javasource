package ch3;

public class ForTest12 {
	public static void main(String[] args) {
		// 중첩 for문을 이용해서 
		// 4x + 5y = 60의 모든 해 구하기
		// 출력은 (x,y) 형태
		// x,y는 10 이하의 자연수
		for (int x = 1 ; x <= 10 ; x++) {
			for (int y = 1 ; y <= 10 ; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.printf("(%d,%d)\n",x,y);
				}
			}
		}
	}
}
