package ch4;

public class ProductEx {
	public static void main(String[] args) {
		// 상품코드 (pCode), 상품명(pName), 제조회사(company), 가격(price), 할인율(discount)
		Product p1 = new Product("p-001","장난감","삼성",50000,0);
		System.out.println(p1.price);
		p1.setDiscount(0.15);
		System.out.println(p1.discount);
		
		System.out.println(p1.sellPrice());
	}
}
