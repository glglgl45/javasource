package student;

import java.util.Scanner;

public class StudentAddAction implements Action {

	@Override
	public void execute(Scanner sc) {

		sc.nextLine();
		
		System.out.println("---- 새로운 학생 정보 입력 -----");
		System.out.print("학 번 : ");
		int no = sc.nextInt();
		sc.nextLine();
		System.out.print("이 름 : ");
		String name = sc.nextLine();
		System.out.print("학 년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("생 일(예시 : 05/11) : ");
		String birth = sc.nextLine();
		
		System.out.println();
				
		StudentAddService service = new StudentAddService();
		
		System.out.println(service.insert(no, name, grade, birth)? name + " 학생 정보가 입력 되었습니다." : "입력 실패");
		
	}

}
