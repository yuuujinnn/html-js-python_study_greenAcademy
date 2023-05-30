package transport;

public class Main {

	public static void main(String[] args) {
		// 사람 객체 생성
		Person p1 = new Person("나상호", 10000);
		Person p2 = new Person("김신진", 20000);
		
		// 버스 객체 생성
		Bus bus740 = new Bus("740");
		
		// 택시 객체 생성
		Taxi 카카오T = new Taxi("카카오택시");
		
		p1.take(bus740, 1300);
		p2.take(bus740, 1000);
		
		p1.take(카카오T, 4800);
		
		p1.showInfo();
		p2.showInfo();
		
		bus740.showInfo();
		카카오T.showInfo();
	}
}
