package ch9;

public class BoundedType {
	// Number의 자식 타입만 지정 가능
	public static <T extends Number> int comepare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);	
	}
}
