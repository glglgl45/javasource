package action;

import java.util.Scanner;

import service.BookUpdateService;

public class BookUpdateAction implements Action {
	@Override
	public void execute(Scanner sc) {
		// 사용자로부터 수정할 도서의 코드 받아들이기
		System.out.print("수정할 도서의 코드 입력 : ");
		String code = sc.nextLine();
		System.out.print("도서의 새로운 가격 입력 : ");
		// int price = Integer.parseInt(sc.nextLine());
		int price = sc.nextInt();
		sc.nextLine();
		
		// 입력 받은 정보를 Service 클래스에게 넘겨준 후 결과를 리턴받기
		BookUpdateService service = new BookUpdateService();
		if (service.update(code, price) > 0) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
	}
}
