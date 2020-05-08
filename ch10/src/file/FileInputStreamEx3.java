package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx3 {

	public static void main(String[] args) {
		// mp3 파일을 읽어서 다른 이름으로 저장		
		try(FileInputStream fis = new FileInputStream("d:\\temp\\rolling.mp3");
				FileOutputStream fos = new FileOutputStream("d:\\temp\\copy-rolling.mp3")) {			
			int data;
			long start = System.currentTimeMillis();
			while ((data=fis.read())!=-1) {
				fos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("걸린 시간 : " + (end-start));
			
			
//			byte b[] = new byte[1024];
//			while(fis.read(b)!=-1) {
//				fos.write(b);
//			}
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
