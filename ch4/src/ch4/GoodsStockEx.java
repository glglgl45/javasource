package ch4;

public class GoodsStockEx {
	public static void main(String[] args) {
		GoodsStock goods1 = new GoodsStock("p-0001",30);
		
		GoodsStock goods2 = new GoodsStock("p-0002",50);
		
		System.out.printf("%s 의 현재 재고 수량 : %d\n",goods1.goodsCode,goods1.stockNum);
		System.out.printf("%s 의 현재 재고 수량 : %d\n",goods2.goodsCode,goods2.stockNum);
		
		// p-001 상품의 재고 추가
		goods1.addStock(30);
		System.out.printf("%s 의 현재 재고 수량 : %d\n",goods1.goodsCode,goods1.stockNum);
		
		// p-002 상품의 재고 추가
		goods2.addStock(70);
		System.out.printf("%s 의 현재 재고 수량 : %d\n",goods2.goodsCode,goods2.stockNum);
		
		// p-002 상품의 재고 감소
		goods2.subtractStock(30);
		System.out.printf("%s 의 현재 재고 수량 : %d\n",goods2.goodsCode,goods2.stockNum);
	}
}
