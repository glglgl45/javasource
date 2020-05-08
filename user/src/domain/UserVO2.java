package domain;

public class UserVO2 {
	// userTBL 레코드 필드 값과 동일하게 맞추기
	private int no;
	private String username;
	private int birthYear;
	private String addr;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "UserVO [no=" + no + ", username=" + username + ", birthYear=" + birthYear + ", addr=" + addr + "]";
	}
	
	
}
