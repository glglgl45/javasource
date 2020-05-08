package ch9;

public class ProductEx {
	public static void main(String[] args) {
		Product<Tv,String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트 TV");
		
		Product<Car,String> product2 = new Product<>();
		product2.setKind(new Car("현대"));
		product2.setModel("펠리셰이드");
		
	}
}
