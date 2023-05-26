package taketrans;

public class Bus {
	int busNumber;
	int passenger;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money = money;
		passenger++;
	}
	
	public void showInfo() {
		System.out.printf("%d번 버스의 수입은 %d원이고, 승객수는 %d명입니다.\n", 
				busNumber, money, passenger);
	}
}
