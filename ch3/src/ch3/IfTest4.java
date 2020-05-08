package ch3;

import java.util.Scanner;

public class IfTest4 {
	public static void main(String[] args) {
		// 90이상이면 A
		// 80이상이면 B
		// 70이상이면 C
		// 60이상이면 D
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade;
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = ' ';
		}
		System.out.printf("%d : 등급 %c",score,grade);
	}
}
