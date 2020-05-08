package thread;

public class SmallLetters2 extends Thread {
	
	public SmallLetters2() {
		setName("smallLetters");
	}

	@Override
	public void run() {
		// SmallLetters 해야 하는 작업을 작성
		for(char ch = 'a' ; ch <= 'z' ; ch++) {
			System.out.print(ch + " ");
		}
	}
}
