package stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class AddLineNumberEx {
	public static void main(String[] args) {
		String filePath = "D:\\javasource\\ch10\\src\\stream\\InputStreamEx1.java";
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
			BufferedReader br = new BufferedReader(isr);) {
			String str = null;
			int i = 1;
			while ((str=br.readLine())!=null) {
				System.out.print((i++)+" : ");
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
