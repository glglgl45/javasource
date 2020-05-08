package test;

public class MemberEx {

	public static void main(String[] args) {
		Member member = new Member("홍길동","hong");
		System.out.println(member.login("hong", "12345"));
		member.logout();

	}
	

}
