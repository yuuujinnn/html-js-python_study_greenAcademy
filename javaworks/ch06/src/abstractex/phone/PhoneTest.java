package abstractex.phone;

public class PhoneTest {

	public static void main(String[] args) {
		
		//추상클래스는 객체 생성이 안됨
		//Phone phone = new Phone();
		
		//스마트 폰 객체 생성
		SmartPhone smartPhone = new SmartPhone("이지능");
		
		smartPhone.powerOn();
		smartPhone.internetSearch();
		smartPhone.powerOff();
	}

}
