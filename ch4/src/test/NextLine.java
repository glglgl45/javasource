package test;

import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 피 연산자 입력 : ");
		int op1 = sc.nextInt();
		System.out.print("+ - * / % 중에서 하나를 선택");
		String oper = sc.next();
		// next(), nextLine()
		System.out.print("두번째 피 연산자 입력 : ");
		int op2 = sc.nextInt();

	}

}
