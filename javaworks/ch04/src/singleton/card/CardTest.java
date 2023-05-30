package singleton.card;

public class CardTest {

	public static void main(String[] args) {
		// 카드 회사 객체 생성
		CardCompany company = CardCompany.getInstance();
		
		Card firstCard = company.createCard();
		Card secondCard = company.createCard();
		Card thirdCard = company.createCard();
		
		// 카드 번호 생성
		System.out.println("카드번호: " + firstCard.getCardNum());
		System.out.println("카드번호: " + secondCard.getCardNum());
		System.out.println("카드번호: " + thirdCard.getCardNum());		
	}

}