package test;

public class ShopService {
	// ShopService의 여러 객체를 생성해도
	// 항상 동일한 하나의 객체가 생성되도록 하기
	private static ShopService shopservice;
	private ShopService() {
		super();
	}
	
	static ShopService getInstance() {
		if (shopservice == null) {
			shopservice = new ShopService();
		}
		return shopservice;
	}

}
