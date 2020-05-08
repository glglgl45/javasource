package stream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
		
		//바이트 단위의 입력 담당 추상 클래스
		InputStream in=System.in;
		
		try {
			//입력 스트림으로부터 1바이트를 읽고, 읽은 바이트 리턴
			int input=in.read();
			System.out.println((char)input);
		} catch (IOException e) {			
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
	}
}