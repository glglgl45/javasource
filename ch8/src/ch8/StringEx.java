package ch8;

public class StringEx {
	public static void main(String[] args) {
		String fullName = "Hello.java";
		int index = fullName.lastIndexOf(".");
		
		// 확장자를 제외한 파일명 출력
		String fileName = fullName.substring(0, index);
		System.out.println(fileName);
		// 확장자만 출력
		String ext = fullName.substring(index+1);
		System.out.println(ext);		
	}
}
