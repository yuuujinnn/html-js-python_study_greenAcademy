package interfaceex.tire;

public class CarMain2 {

	public static void main(String[] args) {

		//Car2 객체 생성
		Car2 myCar = new Car2();
		myCar.run();
		
		
		System.out.println("==========================");
		
		//앞바퀴 교체
		myCar.tires[0] = new KumTire();
		myCar.tires[1] = new KumTire();
		myCar.run();
	}
	
}
