package Interfaceex.remocon;

public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10;	// final이 생략되어 있음
	public int MIN_VOLUME = 0;	// 실행 시 컴파일러가 final을 붙여줌
			
	// 추상 메서드(abstract method)
	public void turnOn();
	
	public void turnOff();
	
	public void setVolume(int volume);
	
	// 디폴트 메서드(실체 메서드) - 무음 처리/해제
	default void setMute(boolean mute) {
		if(mute) { // mute == true
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}