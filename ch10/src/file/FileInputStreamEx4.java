package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx4 {

	public static void main(String[] args) {
		// 이미지 파일을 읽어서 다른 이름으로 저장
		try(FileInputStream fis = new FileInputStream("d:\\temp\\picture.jpg");
				FileOutputStream fos = new FileOutputStream("d:\\temp\\copy.jpg")) {		
			byte b[] = new byte[1024];
			while(fis.read(b)!=-1) {
				fos.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		finally {
//			try {
//				fis.close();
//				fos.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
	}
}
