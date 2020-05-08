package service;

import persistence.BookDAO;

public class BookDeleteService {
	public int delete(String code) {
		// 넘겨받은 정보를 데이터베이스에 입력한 후 결과 전송하기
		BookDAO dao = new BookDAO();
		return dao.deleteBook(code);
		
	}

}
