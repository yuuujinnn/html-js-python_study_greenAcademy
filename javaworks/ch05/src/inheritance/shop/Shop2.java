package inheritance.shop;

public class Shop2 extends Headshop {
	// 생성자
	public Shop2() {
		System.out.println("역세권 매장입니다.");
	}
	
	@Override
	public void sellDoenjangjjigae() {
		System.out.println("된장찌개: 8,000원");
	}

	@Override
	public void sellKimchijjigae() {
		System.out.println("김치찌개: 8,500원");
	}

	@Override
	public void sellBibimbap() {
		System.out.println("비빔밥: 9,000원");
	}


}
