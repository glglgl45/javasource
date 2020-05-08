package ch7;

public class BalanceInsufficientException extends Exception {

	// 프로그램만의 Exception 작성
	public BalanceInsufficientException() {
		super();
	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
