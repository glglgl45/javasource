package action;

import java.util.Date;
import java.util.Scanner;

import domain.UserVO;
import service.UserGetService;
import service.UserUpdateService;

public class UserUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 수정할 user 번호 받기
		System.out.println("수정할 사용자의 No를 입력해 주세요");
		System.out.print("No >> ");
		int no = sc.nextInt();
		
		UserGetService getService = new UserGetService();
		UserVO vo = getService.getUser(no);
		
		System.out.println("\n===== 사용자 정보 =====");
		System.out.println("번호\t이름\t생년월일\t\t주소");
		System.out.print(vo.getNo() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getBirthday() + "\t");
		System.out.print(vo.getAddress() + "\n");
		sc.nextLine();

		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		vo.setName(name);
		System.out.print("생년월일 입력 : ");
		String birthday = sc.nextLine();
		vo.setBirthday(birthday);
		System.out.print("주소 입력 : ");
		String address = sc.nextLine();
		vo.setAddress(address);
		
		
		// UserUpdateService객체 update 호출
		// 실행 후 결과를 받아 삭제 성공 혹은 삭제 실패 메시지 출력하기
		UserUpdateService service = new UserUpdateService();
		System.out.println(service.update(vo)?"수정 성공":"수정 실패");
	}
}
