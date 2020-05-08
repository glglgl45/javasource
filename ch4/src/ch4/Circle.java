package ch4;

public class Circle {
	// 반지름(radius)
	int radius;
	
	Circle() {}
	Circle(int radius) {
		this.radius = radius;
	}
	
	// 면적을 구한다 (getArea()) - 리턴타입은 double
	double getArea() {
		return (double)radius*radius*3.14;
	}

}
