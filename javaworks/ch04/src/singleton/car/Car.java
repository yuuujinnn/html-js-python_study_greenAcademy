package singleton.car;

public class Car {
	private static int serialNum = 10000;
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	// 차 번호를 가져올 메서드
	public int getCarNum() {
		return carNum;
	}
}
