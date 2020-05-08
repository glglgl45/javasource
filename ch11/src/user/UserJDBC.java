package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

public class UserJDBC {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("사용자 정보를 입력하세요");
//		System.out.print("이름 : ");
//		String name = sc.nextLine();
//		System.out.print("생년월일(년-월-일) : ");
//		String birthYear = sc.nextLine();
//		System.out.print("주소 : ");
//		String address = sc.nextLine();
//		
//		// 사용자가 입력한 정보를 가지고 DB작업하기
//		UserDAO dao = new UserDAO();
//		int result = dao.insertUser(name,birthYear,address);
//		
//		if (result > 0) {
//			System.out.println("삽입 성공");
//		} else {
//			System.out.println("삽입 실패");
//		}
		
		// 조회
//		System.out.println("조회할 사용자의 no를 입력해 주세요");
//		int no = sc.nextInt();
//		UserDAO dao = new UserDAO();
//		UserVO vo = dao.getUser(no);
//		System.out.println(vo);
		
		// 전체조회
//		UserDAO dao = new UserDAO();
//		List<UserVO> list = dao.getList();
//		// System.out.println(list);
//		for (UserVO vo : list) {
//			System.out.println(vo);
//		}
		
		// update
//		System.out.println("수정할 사용자 정보를 입력해 주세요");
//		System.out.print("번호 입력 : ");
//		int no = sc.nextInt();
//		System.out.print("주소 입력 : ");
//		sc.nextLine();
//		String address = sc.nextLine();
//		
//		UserDAO dao = new UserDAO();
//		UserVO vo = new UserVO();
//		vo.setNo(no);
//		vo.setAddress(address);
//		int result = dao.updateUser(vo);
//		if (result > 0) {
//			System.out.println("수정 성공");
//		} else {
//			System.out.println("수정 실패");
//		} // updateUser 종료
		
		// 삭제
		System.out.println("삭제할 사용자 번호를 입력해 주세요");
		int no = sc.nextInt();
		UserDAO dao = new UserDAO();
		int result = dao.deleteUser(no);
		if (result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}	
	}
}
