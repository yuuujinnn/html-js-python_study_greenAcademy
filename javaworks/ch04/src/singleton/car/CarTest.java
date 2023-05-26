package singleton.car;

public class CarTest {

	public static void main(String[] args) {
		// 자동차 공장 객체 생성
		CarFactory company = CarFactory.getInstance();
		
		Car mySonata = company.createCar();
		Car yourSonata = company.createCar();
		
		//차 번호 생성
		System.out.println("차량번호: " + mySonata.getCarNum());
		System.out.println("차량번호: " + yourSonata.getCarNum());

	}

}
