package singleton.car;

public class CarFactory {
	// 싱글톤 패턴
	// 객체 필드(변수)
	private static CarFactory instance;
	
	// 생성자
	private CarFactory() {}
	
	// getInstance() 메서드
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	// 자동차 생산
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
