package action;

import java.util.Scanner;

import service.BookDeleteService;

public class BookDeleteAction implements Action {
	@Override
	public void execute(Scanner sc) {
		// 사용자로부터 삭제할 도서의 코드 받아들이기
		System.out.print("삭제할 도서의 코드 입력 : ");
		String code = sc.nextLine();
		
		// 입력 받은 정보를 Service 클래스에게 넘겨준 후 결과를 리턴받기
		BookDeleteService service = new BookDeleteService();
		if (service.delete(code) > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		// System.out.println(service.delete(code) > 0?"삭제 성공":"삭제 실패");
	}
}
