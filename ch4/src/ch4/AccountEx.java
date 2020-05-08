package ch4;

public class AccountEx {
	public static void main(String[] args) {
		Account account1 = new Account("110-10-1000", "홍길동", 100000);
		Account account2 = new Account("110-10-2000", "김성준", 200000);
		Account account3 = new Account("110-10-3000", "김지영", 300000);
		Account account4 = new Account("110-10-4000", "송선욱", 400000);
		
		print(account1);
		print(account2);
		print(account3);
		print(account4);
		
//		// 예금한다.
//		System.out.println("현재 잔액 : " + account.deposit(300000));
//		// 출금한다.
//		System.out.println("현재 잔액 : " + account.withdraw(300000));
	}
	static void print(Account account1) {
		System.out.println("계좌번호 : " + account1.accountNo);
		System.out.println("계좌주 : " + account1.name);
		System.out.println("잔액 : " + account1.balance);
	}
}
