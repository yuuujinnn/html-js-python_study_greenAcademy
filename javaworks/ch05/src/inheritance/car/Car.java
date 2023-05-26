package inheritance.car;

public class Car {
	//필드
	String brand; //브랜드
	int cc;       //배기량
	
	//생성자
	Car(String brand, int cc){
		this.brand = brand;
		this.cc = cc;
	}
	
	//메서드
	String carInfo() {
		return "브랜드: " + brand + ", 배기량: " + cc;
	}
}
