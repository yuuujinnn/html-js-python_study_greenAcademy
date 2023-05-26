package inheritance;

class Car{
	String brand;
	int cc;
	
	Car(String brand, int cc){
		this.brand = brand;
		this.cc = cc;
	}
}

class Taxi extends Car{
	int passenger;
	
	Taxi(String brand, int cc, int passenger){
		super(brand, cc);
		this.passenger = passenger;
	}
}

public class TaxiTest {

	public static void main(String[] args) {
		Taxi taxi = new Taxi("Ionic 5", 3000, 1);

	}

}
