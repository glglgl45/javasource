package action;

import java.util.Scanner;

import service.UserDeleteService;

public class UserDeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 삭제할 user 번호 받기
		System.out.println("삭제할 사용자의 No를 입력해 주세요");
		System.out.print("No >> ");
		int no = sc.nextInt();
		// UserDeleteService객체 delete 호출
		// 실행 후 결과를 받아 삭제 성공 혹은 삭제 실패 메시지 출력하기
		UserDeleteService service = new UserDeleteService();
		System.out.println(service.delete(no)>0?"삭제 성공":"삭제 실패");
	}
}
