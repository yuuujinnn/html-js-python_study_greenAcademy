package singleton.card;

public class CardCompany {
	private static CardCompany instance;
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	//카드 생성
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
