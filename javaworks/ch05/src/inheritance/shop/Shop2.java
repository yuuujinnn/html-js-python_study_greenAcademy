package inheritance.shop;

public class Shop2 extends HeadShop{
	
	public Shop2() {
		System.out.println("역세권 매장입니다.");
	}

	@Override
	public void sellDoenjangJJige() {
		System.out.println("된장찌게: 7,000원");
	}

	@Override
	public void sellKimchiJJige() {
		System.out.println("김치찌게: 7,500원");
	}

	@Override
	public void sellBibimBap() {
		System.out.println("비빔밥: 8,000원");
	}
}
