package ch4;

public class Calculator2 {
	int plus (int x, int y) {
		return x + y;
	}
	double avg (int x, int y) {
		double sum = plus(x,y);
		return sum / 2;
	}
	void execute() {
		double result = avg(7,10);
		println("실행결과 = " + result);
	}
	void println (String message) {
		System.out.println(message);
	}

}
