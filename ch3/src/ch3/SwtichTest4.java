package ch3;

import java.util.Scanner;

public class SwtichTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력(0~100) : ");
		int jumsu = sc.nextInt();
		char grade = ' ';
		switch (jumsu / 10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("등급은 : " + grade);
	}
}
