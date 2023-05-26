package statics;

public class CardTest {

	public static void main(String[] args) {
		// 카드 번호 101, 102, 103번 생성
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		
		System.out.println("카드번호: " + card1.getCardNum());
		System.out.println("카드번호: " + card2.getCardNum());
		System.out.println("카드번호: " + card3.getCardNum());
		
		System.out.println(card1);  //인스턴스 card1의 주소
		System.out.println(card2);
		System.out.println(card3);

	}

}
