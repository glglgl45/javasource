package inherit;

public class BonusPointAccount extends Account {

	private int bonusPoint;
	
	public BonusPointAccount(String ano, String owner, int balance, int bonusPoint) {
		super(ano, owner, balance);
		this.bonusPoint = bonusPoint;
	}

	// 예금한다 : 예금액의 1%를 보너스포인트로 지급
	@Override
	void deposit(int amount) {
		super.deposit(amount);	// 예금한다
		bonusPoint += (int)(amount*0.01);	// 예금액의 1%를 보너스포인트 지급
	}
	
	
}
