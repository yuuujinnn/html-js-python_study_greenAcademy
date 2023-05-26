package enums;

public class SeasonTest {

	public static void main(String[] args) {
		//Season season = null;  //null로 초기화
		//사용 - enum 이름으로 직접 접근
		Season season = Season.여름;
		
		switch(season) {
		case 봄:
			season = Season.봄;
			break;
		case 여름:
			season = Season.여름;
			break;
		case 가을:
			season = Season.가을;
			break;
		case 겨울:
			season = Season.겨울;
			break;
		}
		System.out.println("현재 계절은 " + season + "입니다.");
		
		if(season == Season.여름) {
			System.out.println("무더위와 장마가 많이 옵니다.");
		}else {
			System.out.println("무더위와 장마가 많지 않습니다..");
		}
	}
}
