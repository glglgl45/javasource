package exam;

public class Account {
	String accountNo;
	String name;
	int balance;
	// 필드  - 계좌번호(accountNo), 이름(name), 잔액(balance)
	
	Account () {}
	Account (String accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	void deposit(int num1) {
		balance += num1;
		System.out.println("현재 잔액 : " + balance);
	}
	void withdraw(int num1) {
		balance -= num1;
		System.out.println("현재 잔액 : " + balance);
	}
	
	// 기능 - 예금한다(deposit) / 출금한다(withdraw)
	// 입금할 금액/ 출금금액을 입력받아 현재 잔액에 더하거나 빼기
}
