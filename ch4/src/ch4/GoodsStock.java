package ch4;

// 상품 재고 관리
public class GoodsStock {
	String goodsCode;	// 상품 코드 - "p-0001"...
	int stockNum;		// 재고 수량 - 30,40,...
	
	// 생성자
	// 기본생성자
	GoodsStock () {}
	// 인자를 모두 받는 생성자
	GoodsStock (String goodsCode,int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	// 메소드 - 동작(기능)
	// 재고 수량 변경 - 증가 / 감소
	void addStock(int stock) {
		this.stockNum += stock;
		// 재고수량 증가
	}
	void subtractStock(int stock) {
		this.stockNum -= stock;
		// 재고수량 감소
	}
}
