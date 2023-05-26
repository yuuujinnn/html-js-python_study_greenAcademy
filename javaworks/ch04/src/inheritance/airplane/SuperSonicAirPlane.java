package inheritance.airplane;

public class SuperSonicAirPlane extends AirPlane{
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SuperSonicAirPlane.SUPERSONIC) {
			System.out.println("비행기가 초음속 비행합니다.");
		}
		else {
			super.fly();
		}
		
	}
	
	
	
	

}
