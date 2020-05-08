package ch3;

import java.util.Scanner;

public class IfTest8 {
	public static void main(String[] args) {
		// 근무시간을 사용자로부터 입력받아 시간제 임금을 계산
		// 8시간 까지는 9000,초과분 1.5
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간 : ");
		int wt = sc.nextInt();
		int pey = 9000;
		int overpey = pey * 3 / 2;
		int money = 0;
		if (wt <= 8) {
			money = wt*pey;
		} else {
			money = 8*pey +(wt-8)*overpey ;
		}
		System.out.println("임금 : " + money);
	}
}
