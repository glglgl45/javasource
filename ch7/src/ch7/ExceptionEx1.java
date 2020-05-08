package ch7;

public class ExceptionEx1 {
	public static void main(String[] args) {
		// Exception : 프로그램 예외(로직의 이상, 외부의 입력값에 의해서 발생)
		
		// 처리방식
		// 1. try-catch 문
		// try {} 문만 올 수 없음
			try{/*예외가 발생 할 수 있는 구문*/} catch(Exception e) {} finally {/*예외 여부 상관없이 발생하는 구문*/}
			try{} catch(Exception e) {}
			try{} finally {}
		// 2. exception 던지기 : 메소드를 호출하는 측에서 처리
			
		// catch구문은 개별적으로 Exception을 처리할 수도 있고,
		// 한꺼번에 부모의 타입으로 처리 가능
		// 멀티 catch 문도 가능하다
			
		// 강제 예외 발생
		// throw new Exception() : 컴파일단계에서 체크하고 싶을 때
		// throw new RunTimeException() : 런타임단계에서 체크하고 싶을 때
	}
}
