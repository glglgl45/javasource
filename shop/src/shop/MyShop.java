package shop;

import java.util.Scanner;

public class MyShop implements IShop {
	private String title;	// 상점 이름 보관
	private User[] users = new User[2];
	private Product[] products = new Product[5];
	private Scanner sc = new Scanner(System.in);
	private Product[] carts = new Product[10];	// 장바구니
	private int selUserNum = 0;

	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public void genUser() {
		// User 객체를 사용하여 쇼핑몰 이용자 생성
		users[0] = new User("홍길동",PayType.CARD);
		users[1] = new User("성춘향",PayType.CASH);
	}
	@Override
	public void genProduct() {
		// CellPhone(3), SmartTV(2) 객체를 사용해서 제품 생성
		products[0] = new CellPhone("갤럭시S10",1200000,"SKT");
		products[1] = new CellPhone("아이폰11",1500000,"KT");
		products[2] = new CellPhone("LG gram",1000000,"LG");
		products[3] = new SmartTV("삼성 60인치",10000000,"4K");
		products[4] = new SmartTV("LG 65인치",8000000,"4K");
	}
	@Override
	public void start() {
		System.out.println(title + " : 메인 화면 - 계정 선택");
		System.out.println("==========================");
//		for (int i = 0 ; i < users.length ; i++) {
//			System.out.printf("[%d]%s(%s)\n",i,users[i].getName(),users[i].getPaytype());
//		}
		int i = 0;
		for (User user : users) {
			System.out.printf("[%d]%s(%s)\n",i++,user.getName(),user.getPaytype());
		}
		System.out.println("[x]종 료");
		System.out.print("선택 : ");
		String input = sc.next();	// input => 0,1,X
		
		// 0,1 이면 productList 메소드를 호출
		// X이면 현재 프로그램 종료
//		if (input.equals("x")) {
//			System.out.println("종료");
//		} else {
//			System.out.println("### " + input + "선택 ###");
//			productList();
//		}
		switch (input) {
		case "0":case "1":
			System.out.println("## " + input + "선택 ##");
			selUserNum = Integer.parseInt(input);
			productList();
			break;
		case "x":case "X":
			System.out.println("shop을 종료합니다.");
			break;
		default:
			System.out.println("입력 값을 확인해 주세요");
			start();
			break;
		}
	}
	
	public void productList() {
		System.out.println(title + " : 상품목록 - 상품 선택");
		System.out.println("==========================");
		int i = 0;
		for (Product product : products) {
			System.out.printf("[%d]",i++);
			product.printDetail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		String sel = sc.next();	// 상품번호,h,c
		switch (sel) {
		//h가 입력되면 메인화면 보여주기
		case "h":
			System.out.println("## " + sel + "선택 ##");
			start();
			break;
		//c가 입력되면 checkOut() 메소드를 호출
		case "c":
			System.out.println("## " + sel + "선택 ##");
			checkOut();
			break;
		//상품 번호가 입력되면 장바구니에 해당 상품 담기
		case "0": case "1": case "2": case "3": case "4":
			for (int j = 0 ; j < carts.length ; j++) {
				if (carts[j] == null) {
					carts[j] = products[Integer.parseInt(sel)];
					if (carts[carts.length-1]!=null) {
						System.out.println("장바구니가 가득 찼습니다.");
						break;
					}
					System.out.println(sel + "번 상품이 장바구니에 담겼습니다.");
					break;
				}
			}
			productList();
			break;
		default:
			System.out.println("입력 값을 확인해 주세요");
			productList();
			break;
		}
	}
	
	public void checkOut() {
		// 장바구니에 담아놓은 제품 목록 보여주기
		int cartSum = 0;
		System.out.println(title + " : 체크아웃");
		System.out.println("==========================");
		for (int i = 0 ; i < carts.length ; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d]%s(%d)\n",i,carts[i].getPname(),carts[i].getPrice());
				cartSum += carts[i].getPrice();
			}
		}
		System.out.println("==========================");
		System.out.println("결제 방법 : " + users[selUserNum].getPaytype());
		System.out.printf("합계 : %d 원 입니다\n",cartSum);
		System.out.println("[p]이전, [q]결제 완료");
		System.out.println("선택 : ");
		String sel = sc.next();
		switch (sel) {
		case "p":
			System.out.println("## " + sel + "선택 ##");
			productList();
			break;
		case "q":
			System.out.println("## " + sel + "선택 ##");
			System.out.println("결제완료 되었습니다.");
			break;
		default:
			System.out.println("입력 값을 확인해 주세요");
			checkOut();
			break;
		}		
	}
}
