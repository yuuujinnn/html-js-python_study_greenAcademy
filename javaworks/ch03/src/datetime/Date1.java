package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		// 날짜와 시간 객체 생성
		Date now = new Date();
		System.out.println(now);
		
		//날짜와 시간 형식(년-월-일 시:분:초), 주의 - MM(대문자)
		SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(datetime.format(now));
		
		//날짜
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date.format(now));
		
		//시간
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(time.format(now));
	}
}
