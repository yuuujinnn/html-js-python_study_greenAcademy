package collections.product;

public class ProductTest {
	public static void main(String[] args) {
		//자료형 <클래스, 문자열>
		Product<TV, String> product1 = new Product<>();
		TV tv = new TV();
		product1.setKind(tv);
		product1.setModel("스마트TV");
		
		tv.making();
		String tvModel = product1.getModel();
		System.out.println("모델: " + tvModel);
		
		//자동차
		Product<Car, String> product2 = new Product<>();
		Car car = new Car();
		product2.setKind(car);
		product2.setModel("전기차");
		
		car.making();
		String carModel = product2.getModel();
		System.out.println("모델: " + carModel);
		
	}
	
}
