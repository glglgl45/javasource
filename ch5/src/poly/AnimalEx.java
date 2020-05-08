package poly;

public class AnimalEx {
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println();
		
		//자동 형변환이 일어남
		Animal animal = new Cat();
		// Cat cat1 = new Dog(); X
		System.out.println();
		Feline feline1 = new Cat();
		
		// ClassCastException
		Feline feline2 = (Feline) new Animal();
	}
}
