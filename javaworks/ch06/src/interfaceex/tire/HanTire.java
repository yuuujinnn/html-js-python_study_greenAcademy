package interfaceex.tire;

//Tire를 구현한 HanTire
public class HanTire implements Tire{

	@Override
	public void roll() {
		System.out.println("한타이어가 굴러갑니다.");
	}

}
