package thread;

import javax.swing.JOptionPane;

public class ThreadInterruptEx {
	public static void main(String[] args) {
		
		ThreadInterrupt t1 = new ThreadInterrupt();
		t1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력 값은 " + input + " 입니다.");
		t1.interrupt();	// 쓰레드의 작업 취소 요청 => t1의 interrupted 값을 true로 변경
		System.out.println("Interrupted() : " + t1.isInterrupted());
		
	}
}
