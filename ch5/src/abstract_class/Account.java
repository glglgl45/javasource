package abstract_class;

// abstract - 추상

// 메소드 앞에 abstract이 오는 경우 {}를 가지지 않음
// 추상 메소드가 존재한다면 클래스는 추상 클래스가 되어야 함
public abstract class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public static final int max =15;
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public abstract void withdraw();

}
