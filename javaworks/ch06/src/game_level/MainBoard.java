package game_level;

public class MainBoard {

	public static void main(String[] args) {
		//Player의 객체 생성
		Player player = new Player();
		//처음 생성시 BeginnerLevel이 출력
		player.play(1);
		
		//중급자 레벨
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		//고급자 레벨
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
