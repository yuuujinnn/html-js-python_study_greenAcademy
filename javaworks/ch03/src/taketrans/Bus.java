package taketrans;

public class Bus {
	
	int busNumber;  //버스번호
	int passenger;  //승객 수
	int money;  //수입
	
	//생성자
	Bus(int busNumber){
		this.busNumber = busNumber;
	}
	
	//사람을 태우는 기능을 하는 메서드
	void take(int money) {
		this.money += money;
		passenger++;  //passenger += 1
	}
	
	//버스의 정보
	void showInfo() {
		System.out.printf("%d번 버스의 수입은 %,d원이고, "
				+ "승객수는 %d명입니다.\n", busNumber, money, passenger);
	}
}
