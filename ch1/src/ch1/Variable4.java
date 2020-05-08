package ch1;

public class Variable4 {
	public static void main(String[] args) {
		//실수 (기본값으로 double 인식됨)
		// float : 4byte, double : 8byte(정밀도 부분이 우수)
		float f1 = 3.14f;
		float f2 = 3e6F;
		double d1 = 3.14d;
		double d2 = 3e6;
		double d3 = 2e-3;
		
		System.out.println("float 형 : f1 ="+f1+", f2 = "+f2);
		System.out.println("double 형 : d1 = "+d1+", d2 = "+d2+", d3 = "+d3);
		
		
	}
}
