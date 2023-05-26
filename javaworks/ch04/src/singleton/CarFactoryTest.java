package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory1 = CarFactory.getInstance();
		CarFactory factory2 = CarFactory.getInstance();
		
		Car myAvante = factory1.createCar();
		System.out.println(myAvante.getCarNum());
		
		Car yourAvante = factory1.createCar();
		System.out.println(yourAvante.getCarNum());
		
		System.out.println(factory1);
		System.out.println(factory2);
	}

}
