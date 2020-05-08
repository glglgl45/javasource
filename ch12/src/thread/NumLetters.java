package thread;

public class NumLetters extends Thread {
	@Override
	public void run() {
		// 숫자 1~30까지 출력하기
		for(int i = 1 ; i <= 30 ; i++) {
			System.out.print(i + " ");
		}
		super.run();
	}
}
