package game_level;

public abstract class PlayerLevel {
	
	//추상 메서드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//템플릿 메서드(재정의 못함)
	public final void go(int count) {
		run();
		for(int i=1; i<=count; i++) {
			jump();
		}
		turn();
	}
}
