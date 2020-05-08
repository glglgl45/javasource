package abstract_class;

public class CheckingAccount extends Account {

	public CheckingAccount(String ano, String owner, int balance) {
		super(ano, owner, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw() {
		// 추상 클래스를 상속받는 하위 클래스는 무조건
		// 오버라이딩 해야 함

	}

}
