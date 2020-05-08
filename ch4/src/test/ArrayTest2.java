package test;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// Member 객체 배열을 생성
//		Member members[] = new Member[3];
//		members[0] = new Member("홍길동","hong123");
//		members[1] = new Member("김수지","kim123");
//		members[2] = new Member("차돌이","cha123");
		
		Member members[] = null;	
		
		// 사용자로부터 생성(Member)할 갯수 입력받기
		System.out.print("생성할 배열의 수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 입력받은 숫자만큼 Member객체 배열 생성
		members = new Member[num];
		
		for (int i = 0 ; i < num ; i++) {
			System.out.print(i+1 + "번째 이름 입력 : ");
//			Scanner sc1 = new Scanner(System.in);
//			String name = sc1.nextLine();
			String name = sc.next();
			System.out.print(i+1 + "번째 아이디 입력 : ");
//			Scanner sc2 = new Scanner(System.in);
//			String id = sc2.nextLine();
			String id = sc.next();
			members[i] = new Member(name,id);
		}
		
		// 생성 후 출력
		for (Member m : members) {
			System.out.print(m.name + "\t");
			System.out.print(m.id + "\n");
		}

	}

}
