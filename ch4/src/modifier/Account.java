package modifier;

public class Account {
	private String accountNo;
	private String name;
	private int balance;
	public Account() {
		super();
	}
	public Account(String accountNo, String name, int balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}	
	// 속성의 변경을 위해서 메소드를 제공
	// 속성값을 세팅하는 목적일 때는 set~~
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	// 속성값을 가져오는 목적일 때는 get~~ 
	public String getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
}
