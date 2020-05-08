package ch4;

public class SubscriberInfoEx {
	public static void main(String[] args) {
		// 이름(name) / 아이디(id), 비밀번호(pwd), 전화번호(tel), 주소(addr)
		SubscriberInfo info1 = new SubscriberInfo("홍길동", "hong123", "12345", "010-1234-5678", "서울");
		System.out.println(info1);
		SubscriberInfo info2 = new SubscriberInfo("성춘향", "sung123", "12345");
		System.out.println(info2);

		info1.changePwd("67890");	// 비밀번호 변경
		info1.changeTel("010-9123-4567");	// 전화번호 변경
		info1.changeAddr("경기");	// 주소 변경
		System.out.println(info1);
		
		info2.changeTel("010-0658-7598");
		info2.changeAddr("경기도");
		System.out.println(info2);
	}
}
