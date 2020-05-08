package ch9;

import java.util.Arrays;

public class CourseEx {
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		

		Course<Worker> workerCourse = new Course<>("직장인",3);
		workerCourse.add(new Worker("직장인"));

		Course<Student> studentCourse = new Course<>("학생",3);
		studentCourse.add(new Student("학생"));
		
		Course<HighStudent> highStidentCourse = new Course<>("고등학생",3);
		highStidentCourse.add(new HighStudent("고등학생"));
		
		// 수강생 등록
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStidentCourse);		
		
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStidentCourse);
		// registerCourseStudent(workerCourse);
		
		registerCourseWorker(workerCourse);
		registerCourseWorker(personCourse);
	}
	public static void registerCourse(Course<?> course) {
		// Person / Student / Worker / HighStudent
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		// Student / HighStudent
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {
		// Person / Worker
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
}
