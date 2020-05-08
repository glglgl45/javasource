package ch2;

public class Trapezoid {
	public static void main(String[] args) {
		// 534자루의 연필을 30명의 학생들에게 똑같은 개술 나눠줄 때 
		// 학생 당 몇 개를 가질 수 있고 최종적으로 몇 개가 남는지 출력하기
		int pen = 534;
		int stu = 30;
		int per = pen / stu;
		int etc = pen % stu;
		
		System.out.printf("학생 당 %d개를 가질 수 있고 %d개가 남는다.", per, etc);
		System.out.printf("\n학생당 연필 수 : %d\n",pen/stu);
		System.out.printf("나머지 연필 수 : %d\n",pen%stu);
	}
}
