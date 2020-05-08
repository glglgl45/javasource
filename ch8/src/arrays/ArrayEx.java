package arrays;

import java.util.Arrays;
 
public class ArrayEx {
	public static void main(String[] args) {
		// Arrays 클래스 : 배열과 관련된 유용한 기능을 제공하는 클래스
		char ch[] = {'h', 'a','p','p','y'};
		char ch2[] = new char[ch.length];
		
		// 배열 복사하기
		System.arraycopy(ch,0,ch2,0,ch.length);
		System.out.println(ch2);
		
		char ch3[] = Arrays.copyOf(ch, ch.length);
		System.out.println(ch3);

		char ch4[]=Arrays.copyOfRange(ch3, 1, 3);
		System.out.println(ch4);
		
	}
}
