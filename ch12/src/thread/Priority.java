package thread;

public class Priority {
	public static void main(String[] args) {
		// Thread 우선순위 : MAX_PRIORITY(10)
		// MIN_PRIORITY(1), Thread.NORM_PRIORITY(5)
		for (int i = 1 ; i <= 10 ; i++) {
			Thread thread = new CalcThread("thread" + i);
			if (i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}
