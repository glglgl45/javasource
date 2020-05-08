package student;

import java.util.Scanner;

public class StudentGetAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.print("검색하고자 하는 학생의 학번을 입력하세요 \t");
		int no = sc.nextInt();
		
		StudentGetService service = new StudentGetService();
		StudentVO vo = service.getStudent(no);
		
		System.out.println("---- 학생 개별 정보 보기 -----");
		System.out.println("이름 : " + vo.getName());
		System.out.println("학년 : " + vo.getGrade());
		System.out.println("생일 : " + vo.getBirth());
	}
}
