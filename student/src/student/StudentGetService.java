package student;


public class StudentGetService {
	public StudentVO getStudent(int no) {
		StudentDAO dao = new StudentDAO();
		return dao.getStudent(no);		
	}

}
