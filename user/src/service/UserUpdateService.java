package service;

import domain.UserVO;
import persistence.UserDAO;

public class UserUpdateService {
	public boolean update(UserVO vo) {
		// dao의 deleteUser() 호출
		UserDAO dao = new UserDAO();
		return dao.updateUser(vo)>0 ? true : false;
	}

}
