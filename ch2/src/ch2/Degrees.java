package ch2;

import java.util.Scanner;

public class Degrees {
	public static void main(String[] args) {
		// 사용자로부터 화씨온도를 입력받아 섭씨온도로 변경하는 프로그램 f c 32 c0 = f32 1.8
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨 온도 입력 : ");
		int fahr = sc.nextInt();
		// 섭씨온도 = (화씨온도-32) * 5/9
		double c = (double)(fahr-32)*5/9;
		System.out.println("섭씨온도 : " + c);
	}
}
