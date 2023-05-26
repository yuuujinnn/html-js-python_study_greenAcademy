package transport;

public class Vehicle {
	//필드
	String vehicleName; //차량 이름
	int money;          //수입
	int passengerCount; //승객수
	
	//생성자
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	//운송하다(태우다) 메서드 - 수입이 증가하고, 승객수가 증가
	public void carry(int money) {
		this.money += money;
		passengerCount++;
	}
	
	//차량의 정보 출력
	public void showInfo() {
		System.out.printf("%s의 수입은 %,d원이고, 승객수는 %d명입니다.\n",
				vehicleName, money, passengerCount);
	}
	
}
