package poly;

public class InstancOfEx {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		method1(animal1);
		method2(animal1);
		
		Animal animal2 = new Animal();
		method1(animal2);
		method2(animal2);		
	}
	
	// instanceof : 객체타입 확인
	// 리턴값이 true / false 로 넘어옴
	// animal instanceof Dog : animal이 Dog의 객체 이냐?
	public static void method1(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println("method1 - Dog 로 변환 성공");
		} else {
			System.out.println("method1 - Dog 로 변환 실패");
		}
	}
	public static void method2(Animal animal) {
		Dog dog = (Dog) animal;
		System.out.println("method2 - Dog 로 변환 성공");
		
	}
}
