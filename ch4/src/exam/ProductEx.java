package exam;

public class ProductEx {
	public static void main(String[] args) {
		// Product 객체 배열 3개
		// 인자를 모두 받는 생성자를 이용해서 객체 생성
		// 상품코드 (pCode), 상품명(pName), 제조회사(company), 가격(price), 할인율(discount)
		Product product[] = new Product[3];
		product[0] = new Product("p-001","갤럭시","삼성전자",1000000,15);
		product[1] = new Product("p-002","아이폰","애플",1500000,10);
		product[2] = new Product("p-003","아이패드","애플",2000000,5);
		
		// 출력
//		for (Product p : product) {
//			System.out.print(p.pCode + "\t");
//			System.out.print(p.pName + "\t");
//			System.out.print(p.company + "\t");
//			System.out.print(p.price + "\t");
//			System.out.print(p.discount + "\n");
//		}
		
		print(product[0]);
		print(product[1]);
		print(product[2]);
	}
	public static void print(Product p) {
		System.out.print(p.pCode + "\t");
		System.out.print(p.pName + "\t");
		System.out.print(p.company + "\t");
		System.out.print(p.price + "\t");
		System.out.print(p.discount + "\n");
	}
}
