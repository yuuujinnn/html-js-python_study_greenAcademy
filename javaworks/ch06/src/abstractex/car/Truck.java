package abstractex.car;

public class Truck extends Car{

	@Override
	public void run() {
		System.out.println("트럭이 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}
	
	public void load() {
		System.out.println("트럭이 짐을 싣습니다.");
	}

}
