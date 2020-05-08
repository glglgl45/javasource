package ch8;

public class Append {
	public static void main(String[] args) {
		StringBuffer buffer1 = new StringBuffer("Hello");
		buffer1.append("wolrd").append(true).append(10.5);
		
		System.out.println(buffer1);
	}
}
