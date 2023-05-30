package inheritance.shop;

public class Shop1 extends Headshop{
	// 생성자
	public Shop1() {
		System.out.println("대학가 매장입니다.");
	}

	@Override
	public void sellDoenjangjjigae() {
		System.out.println("된장찌개: 7,000원");
	}

	@Override
	public void sellKimchijjigae() {
		System.out.println("김치찌개: 7,500원");
	}

	@Override
	public void sellBibimbap() {
		System.out.println("비빔밥: 8,000원");
	}

}
