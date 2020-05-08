package exam;

public class StudentEx {
	public static void main(String[] args) {
		// Student 객체 3개 생성
//		Student student1 = new Student();
//		Student student2 = new Student();
//		Student student3 = new Student();
		Student student[] = new Student[3];
		student[0] = new Student();
		student[1] = new Student();
		student[2] = new Student();
		
		// 첫번째 Student 객체 초기화
		student[0].addr = "서울";
		student[0].name = "홍길동";
		student[0].no = 1;
		
		// 첫번째 Student 객체 초기화 후 확인
//		System.out.println(student[0].no);
//		System.out.println(student[0].name);
//		System.out.println(student[0].addr);

		// 두번째 Student 객체 초기화
		student[1].addr = "부산";
		student[1].name = "김정수";
		student[1].no = 2;
//		System.out.println(student[1].no);
//		System.out.println(student[1].name);
//		System.out.println(student[1].addr);
		
		// 세번째 Student 객체 초기화
		student[2].addr = "경기도";
		student[2].name = "성춘향";
		student[2].no = 3;
//		System.out.println(student[2].no);
//		System.out.println(student[2].name);
//		System.out.println(student[2].addr);
//		for (int i = 0 ; i < student.length ; i++) {
//			System.out.println(student[i].no);
//			System.out.println(student[i].name);
//			System.out.println(student[i].addr);
//		}
		
		print(student);
	}
	public static void print(Student[] student) {
		
	}
}
