package abstractex.template;

public class CarMain {

	public static void main(String[] args) {
		// AICar의 객체 생성 - 부모 타입으로 형 변환
		Car myCar = new AICar();
		
		myCar.run();
	}

}
