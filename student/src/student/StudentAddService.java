package student;


public class StudentAddService {
	public boolean insert(int no, String name, int grade, String birth) {
		// 사용자가 입력한 정보를 가지고 DB작업하기
		StudentDAO dao = new StudentDAO();
		int result = dao.insertStudent(no, name, grade, birth);
		
		return result > 0 ? true : false;
	}

}
