package taketrans;

public class Main {

	public static void main(String[] args) {
		Person inbi = new Person("인비", 10000);

		Bus bus100 = new Bus(100);
		
		inbi.takeBus(bus100);
		
		inbi.showInfo();
		bus100.showInfo();
	}

}
