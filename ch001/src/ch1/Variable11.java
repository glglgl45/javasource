package ch1;

public class Variable11 {

	public static void main(String[] args) {
		// 이스케이프 문자 => \n(줄바꿈), \t(tab), \r, \', \"
		System.out.println("아름다운\t야경입니다.");
		System.out.println("아름다운\n야경입니다.");
		System.out.println("아름다운\r야경입니다.");
		System.out.println("\"아름다운야경입니다.\"");
		// \"(쌍따옴표 출력)
		System.out.println("\'아름다운야경입니다.\'");
		// \'(홑따옴표 출력)
		System.out.println("아름다운\\야경입니다.");
		// \\(역슬래시 출력)

	}

}
