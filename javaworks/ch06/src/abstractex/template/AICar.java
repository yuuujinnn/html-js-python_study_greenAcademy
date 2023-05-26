package abstractex.template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자동차가 자율주행 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
	}
	
	// run()을 재정의 할수 없다.
	/* public void run() {
		
	}*/
	
}
