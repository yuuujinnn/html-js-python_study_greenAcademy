package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		//날짜와 시간 객체 생성
		Date today = new Date();
		System.out.println(today);
		
		//날짜와 시간 형식
		SimpleDateFormat datetime = new SimpleDateFormat("yy-mm-dd hh:mm:ss a");
		System.out.println(datetime.format(today));
		
		//날짜
		SimpleDateFormat date = new SimpleDateFormat("yy-mm-dd");
		System.out.println(date.format(today));
		
		//시간
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(time.format(today));
	}
}
