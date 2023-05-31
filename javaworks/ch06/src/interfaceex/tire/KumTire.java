package interfaceex.tire;

//Tire를 구현한 KumTire
public class KumTire implements Tire{

	@Override
	public void roll() {
		System.out.println("금타이어가 굴러갑니다.");
	}

}
