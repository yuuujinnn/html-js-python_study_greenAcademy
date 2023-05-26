package inheritance.airplane;

public class AirPlaneMain {

	public static void main(String[] args) {
		//SuperSonicAirPlane 객체 생성
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		sa.takeOff();
		sa.fly();
		//초음속 비행
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		sa.fly();
		//비행모드
		sa.flyMode = SuperSonicAirPlane.NORMAL;
		sa.fly();
		
		sa.land();
	}

}
