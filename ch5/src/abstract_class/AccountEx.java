package abstract_class;

public class AccountEx {
	public static void main(String[] args) {
		// 추상클래스는 객체 생성 불가
		// Account account = new Account("","",0);
		
		Account account = new CheckingAccount("111", "홍길동", 100000);
		account.deposit(200000);
		account.withdraw();
	}
}
