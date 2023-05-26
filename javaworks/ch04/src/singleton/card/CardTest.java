package singleton.card;

public class CardTest {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();
		
		Card card1 = company.createCard();
		Card card2 = company.createCard();
		Card card3 = company.createCard();
			
		System.out.println("카드번호: " + card1.getCardNum());
		System.out.println("카드번호: " + card2.getCardNum());
		System.out.println("카드번호: " + card3.getCardNum());
	}

}
