package ch3;

import java.io.IOException;

public class WhileTest6 {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("==================");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("==================");
				System.out.print("선택 : ");
			}
			keyCode = System.in.read();
			
			if (keyCode == 49) {	// 숫자 1의 ASCII Code 값
				speed++;
				System.out.println("현재속도 = " + speed);
			} else if (keyCode == 50) {		// 숫자 2
				speed--;
				System.out.println("현재속도 = " + speed);
			} else if (keyCode == 51) {		// 숫자 3
				run = false;
			}
		}
		System.out.println("시스템 종료");
	}
}
