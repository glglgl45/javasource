package ch3;

import java.util.Scanner;

public class IfTest9 {
	public static void main(String[] args) {
		// 세개의 숫자를 입력 받은 후 가장 작은 수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("2번째 숫자 : ");
		int num2 = sc.nextInt();
		System.out.print("3번째 숫자 : ");
		int num3 = sc.nextInt();
		int min = 0;
		
		/*
		if (num1 > num2) {
			if (num2 > num3) {
				min = num3;
			} else {
				min = num2;
			}
		} else if (num1 > num3){
			min = num3;
		} else {
			min = num1;
		}
		*/
		
		min = num1;
		if (min > num2) {
			min = num2;
		}
		if (min > num3) {
			min = num3;
		}
		System.out.println("가장 작운 수 : " + min);
		
		//제일 큰수
		int max = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		System.out.println("가장 큰 수 : " + max);
		
	}
}
