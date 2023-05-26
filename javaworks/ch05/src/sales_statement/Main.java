package sales_statement;

public class Main {

	public static void main(String[] args) {
		// Drink 객체 생성
		Drink coffee = new Drink("커피", 2500, 10);
		Drink tea = new Drink("녹차", 3000, 4);
		// Alcohol 객체 생성
		Alcohol soju = new Alcohol("소주", 4000, 5, 15.5f);
		
		Drink.printTitle(); //클래스 이름으로 직접 접근(제목)
		coffee.printData();
		tea.printData();
		
		System.out.println();
		
		Alcohol.printTitle();
		soju.printData();
		
		//총 판매금액
		int total = coffee.getTotalPrice() + tea.getTotalPrice()
		            + soju.getTotalPrice();
		
		
		System.out.printf("\n\n*** 합계 금액 : %,d원 ***\n", total);
	}

}
