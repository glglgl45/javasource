package shop;

public class User {
	// 이름, 결제방법(PayType의 값에서 결정)
	private String name;
	private PayType paytype;
	
	public User(String name, PayType paytype) {
		super();
		this.name = name;
		this.paytype = paytype;
	}

	public String getName() {
		return name;
	}

	public PayType getPaytype() {
		return paytype;
	}

}
