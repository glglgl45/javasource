package inherit;

public class CheckingAccountEx {
	public static void main(String[] args) throws Exception {
		CheckingAccount checkingAccount = new CheckingAccount("111-11", "홍길동", 1000000, "222-22");
		
		// 입금한다.
		checkingAccount.deposit(300000);
		System.out.println("현재 잔액 : " + checkingAccount.getBalance());
		// 출금한다.
		checkingAccount.withdraw(600000);
		System.out.println("현재 잔액 : " + checkingAccount.getBalance());
		
		// 체크카드 사용액 지불한다.
		// 카드번호가 일치하는 경우
		System.out.println("현재 잔액 : " + checkingAccount.pay("222-22", 300000));
		// 불일치하는 경우
		System.out.println("현재 잔액 : " + checkingAccount.pay("333-22", 300000));
	}
}
