package ch4;

// 두 수를 받아 사칙연산 하는 프로그램
public class Calc {
	int num1;	// 첫번째 수
	int num2;	// 두번째 수
	
	// 기본 생성자
	Calc() {}
	// 인자를 모두 받는 생성자
	Calc(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// void : 리턴 없음
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	// 덧셈
	int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	// 뺄셈
	int sub(int num1, int num2) {
		return num1-num2;
	}
	// 나누기 : 두 수를 받아서 num1 / num2 를 한 결과를 double타입으로 리턴
	// 리턴값타입 메소드명 () {}
	double div(int num1, int num2) {
		return (double)num1/num2;
	}
}
