package action;

import java.util.List;
import java.util.Scanner;

import domain.BookVO;
import service.BookListService;

public class BookListAction implements Action {
	@Override
	public void execute(Scanner sc) {
		BookListService service = new BookListService();
		List<BookVO> list = service.getList();
		System.out.println("\n======== 도서정보 전체조회 ========");
		System.out.println("도서코드\t도서명\t\t작가\t가격");
		for (BookVO vo : list) {
			System.out.print(vo.getCode() + "\t");
			System.out.print(vo.getTitle() + "\t");
			System.out.print(vo.getWriter() + "\t");
			System.out.print(vo.getPrice() + "\n");
		}
//		for (BookVO vo : service.getList()) {
//			System.out.print(vo.getCode() + "\t");
//			System.out.print(vo.getTitle() + "\t");
//			System.out.print(vo.getWriter() + "\t");
//			System.out.print(vo.getPrice() + "\n");
//		}
	}
}
