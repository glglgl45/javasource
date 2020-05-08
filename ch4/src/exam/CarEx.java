package exam;

public class CarEx {
	public static void main(String[] args) {
		// Car 객체 배열 3개 선언
		Car car[] = new Car[3];
		
		car[0] = new Car("현대","그랜저","검정",200);
		car[1] = new Car("기아","모닝","흰색",120);
		car[2] = new Car("현대","스타렉스","검정",150);
		
		print(car);
		// 출력
//		for (Car c : car) {
//			System.out.print(c.company + "\t");
//			System.out.print(c.model + "\t");
//			System.out.print(c.color + "\t");
//			System.out.print(c.speed + "\n");
//		}
	}
	
	public static void print(Car[] car) {
		System.out.println(car[0]);	
		System.out.println(car[1]);	
		System.out.println(car[2]);	
	}
}
