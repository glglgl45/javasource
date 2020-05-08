package ch3;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택 : ");
			
			// 사용자가 입력하는 값 받기
			int no = sc.nextInt();
			
			switch (no) {
			case 1:
				System.out.print("예금액 >> ");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액 >> ");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("현재잔액 >> " + balance);
				break;
			case 4:
				System.out.println("---------------------------");
				System.out.println("            종료되었습니다");
				System.out.println("---------------------------");
				run = false;
				break;
			default:
				System.out.println("번호를 확인해 주세요");
				break;
			}
		}
	}
}
