package sales_statement;

public class Drink {
	// 필드
	protected String name;	// 상품명
	protected int price;	// 가격
	protected int count;	// 수량
	
	// 생성자
	protected Drink(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	// 판매 금액을 가져올 메서드
	int getTotalPrice() {
		// 금액 = 가격 x 수량
		return price * count;
	}
	
	// 제목 출력
	static void printTitle() {
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	// 내용 데이터 출력
	void printData() {
		System.out.println(name + "\t" + price + "\t"
					+ count + "\t" + getTotalPrice());
	}
}
