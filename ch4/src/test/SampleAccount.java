package test;

public class SampleAccount {
	private int balance;// 잔고(balance) 필드 - 외부에서 직접 접근 불가
	
	
	// setBalance(int amount) 구현
	// balance 필드는 음수값이 될 수 없고
	// 최대 백만원까지만 저장이 가능함
	// 음수값이거나, 백만원이 넘는다면 현재의 잔고를 유지
	public void setBalance(int amount) {
		if (amount >= 0 && amount <= 1000000) {	
			this.balance = amount;		
		}
	}
	
	// getBalance() => 현재 잔고 리턴
	public int getBalance() {
		return balance;
	}

}
