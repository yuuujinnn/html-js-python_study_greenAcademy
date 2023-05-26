package sale;

public class Alcohol extends Drink{
	
	float alcper;
	
	public Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}
	
	static void printTitle() {
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}

	@Override
	void printData() {
		System.out.println(name + "(" + alcper + ")" + "\t" + price + "\t" 
				+ count + "\t" + getTotalPrice());
	}
	
}
