package inheritance.airplane;

public class AirPlaneTest {

	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		sa.takeOff();
		sa.fly();
		
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		sa.fly();
	}

}
