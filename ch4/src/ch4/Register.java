package ch4;

public class Register {
	// 필드
	String userId;
	String name;
	String password;
	String mobile;
	String addr;
	
	// 생성자
	
	public Register(String userId, String name, String password, String mobile, String addr) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.mobile = mobile;
		this.addr = addr;
	}

	public Register() {
		super();
	}

	public Register(String userId, String name, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
	}	
	
}
