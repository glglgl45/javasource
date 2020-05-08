package ch4;

public class CardEx {
	public static void main(String[] args) {
		Card card1 = new Card();
		card1.kind = "heart";
		card1.number = 7;
		System.out.println("카드 종류 : " + card1.kind + " 카드 번호 : " + card1.number);
		System.out.println("가로 길이 : " + Card.width + " 세로 길이 : " + Card.height);
		
		Card card2 = new Card();
		card2.kind = "spade";
		card2.number = 6;
		System.out.println("카드 종류 : " + card2.kind + " 카드 번호 : " + card2.number);
		
		Card card3 = new Card();
		card3.kind = "diamond";
		card3.number = 8;
		System.out.println("카드 종류 : " + card3.kind + " 카드 번호 : " + card3.number);
	}
}
