package ch4;

public class Calculator {
	// 오버로딩 : 하나의 클래스에 동일한 이름으로 존재
	
	// 생성자 오버로딩
	// 메소드 오버로딩
	
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
