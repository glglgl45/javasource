package ch7;

public class ClassCastExceptionEx {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Animal();
		try {
			Dog dog1 = (Dog) animal1;
			Dog dog2 = (Dog) animal2;			
		} catch (Exception e) {
			System.out.println("타입 변환 할 수 없습니다.");
		}
//		changeDog(animal1);
//		changeDog(animal2);
	}
//	public static void changeDog(Animal animal) {
//		if (dog instanceof Dog) {
//			Dog dog1 = (Dog) animal;
//		}
//	}
}
