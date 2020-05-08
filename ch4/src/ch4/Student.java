package ch4;

public class Student {
	int grade;		// 학년 - 1,2,3,....
	String name;	// 이름 - 홍길동
	String mobile;	// 핸드폰 번호 - 01052354263,...
	String addr;	// 주소 - 서울, 대구...
	
	// 생성자 오버로딩
	Student () {}
	
	Student (int grade, String name, String addr) {
		this.grade = grade;
		this.name = name;
		this.addr = addr;
	}
	
	Student (int grade, String name, String mobile, String addr) {
//		this.grade = grade;
//		this.name = name;
//		this.mobile = mobile;
		this(grade,name,mobile);
		this.addr = addr;
	}
}
