package test;

public class Member {
	String name;// 이름 : name (문자열)
	String id;// 아이디 : id (문자열)
	String password;// 비밀번호 : password (문자열)
	int age;// 나이 : age (정수)
	
	// 생성자 : name과 id필드를 받아서 초기화
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	// login() 메소드
	// 전달인자로 id, password를 전달 받아 id가 hong이고 
	// password가 12345 인 경우 true를 리턴
	public boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;		
	}
	
	// logout() 메소드
	// 로그아웃 되었습니다 라는 메세지를 출력
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
}
