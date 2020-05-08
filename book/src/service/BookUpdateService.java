package service;

import persistence.BookDAO;

public class BookUpdateService {
	public int update(String code,int price) {

		BookDAO dao = new BookDAO();
		return dao.updateBook(code,price);
	}
}
