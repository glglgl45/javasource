package test;

public class ShopServiceEx {
	public static void main(String[] args) {
		
		ShopService service1 = ShopService.getInstance();
		ShopService service2 = ShopService.getInstance();
		
		System.out.println(service1 == service2);
	}
}