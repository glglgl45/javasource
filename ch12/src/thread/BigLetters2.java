package thread;

public class BigLetters2 {
	public static void main(String[] args) {
		// 멀티스레드로 같이 돌아갈 객체 생성하기
		Thread t1 = new SmallLetters2();
		t1.start();	// 스레드 시작하기
		System.out.println("Thread 1 Name : " + t1.getName());
		
		Thread t2 = new NumLetters();
		t2.start();	// 스레드 시작하기
		System.out.println("Thread 2 Name : " + t2.getName());
		
		// 대문자 A~Z까지 출력하기 65~90		
		for (char ch = 'A'; ch <='Z' ; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println("main Thread Name : " + Thread.currentThread().getName());
	}
}
