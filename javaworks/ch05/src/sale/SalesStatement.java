package sale;

public class SalesStatement {

	public static void main(String[] args) {
		Drink coffee = new Drink("커피", 2500, 10);
		Drink tea = new Drink("녹차", 3000, 4);
		
		Alcohol soju = new Alcohol("소주", 4000, 5, 15.5f);
		
		Drink.printTitle();
		coffee.printData();
		
		System.out.println();
		
		Alcohol.printTitle();
		soju.printData();
		
		//총 판매액
		int total = coffee.getTotalPrice() + tea.getTotalPrice()
		            + soju.getTotalPrice();
		
		System.out.printf("\n*** 합계 금액 : %,d원***\n", total);
	}
}
