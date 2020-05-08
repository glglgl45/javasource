package action;

import java.util.Scanner;

import service.UserAddService;

public class UserAddAction implements Action {

	@Override
	public void execute(Scanner sc) {
		
		sc.nextLine();
		
		System.out.println("사용자 정보를 입력하세요");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일(년-월-일) : ");
		String birthYear = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
				
		UserAddService service = new UserAddService();
		
		System.out.println(service.insert(name,birthYear,address)?"삽입 성공" : "삽입 실패");
		
	}
}
