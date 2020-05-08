package ch3;

import java.util.Scanner;

public class SwtichTest5 {
	public static void main(String[] args) {
		// 사용자로부터 사칙 연산 기호 및 두 개의 숫자를 입력받아 계산 후 출력하는 프로그램 + - * /
		Scanner sc = new Scanner(System.in);
		System.out.println("필요한 사칙연산(+,-,*,/,%) 기호를 입력하세요 : ");
		String op = sc.nextLine();
		
		//두 개의 숫자 입력 받기
		System.out.println("1번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("2번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		int result = 0;
		
		//switch-case 
		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			System.out.println("재입력");
			break;
		}
		System.out.printf("%d %s %d = %d",num1,op,num2,result);
		//System.out.println("연산 결과 : " + result);
	}
}
