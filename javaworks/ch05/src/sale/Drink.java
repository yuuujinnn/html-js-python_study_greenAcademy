package sale;

public class Drink {
	protected String name;  //상품명
	protected int price;    //가격
	protected int count;    //수량
	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	int getTotalPrice() {  //판매 금액
		return price * count;
	}
	
	static void printTitle() {
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	void printData() {
		System.out.println(name + "\t" + price + "\t" 
				+ count + "\t" + getTotalPrice());
	}
}
