package ch3;

import java.util.Scanner;

public class ForTest6 {
	public static void main(String[] args) {
		// 숫자를 입력받아 해당 수자의 factorial 값 구하기
		
		// 5 = 5*4*3*2*1 = 5!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int result = 1;
		
		for (int i = num ; i > 1 ; i--) {
			result *= i;
		}
		System.out.println("결과 : " + num + "! = " + result);
	}
}
