package ch2;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한달 월급 입력 : ");
		int salary = sc.nextInt();
		//System.out.println("월급 : " + salary);
		//한달월급을 10년동안 모두 저축했을 때 저축금액을 구하시오
		int year = 10;
		int month = 12;
		int save = year * month * salary;
		System.out.printf("%d년 저축금액 : %d", year, save);
		

	}
}
