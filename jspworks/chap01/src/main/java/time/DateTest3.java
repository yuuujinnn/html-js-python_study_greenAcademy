package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest3 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now);
		
		DateTimeFormatter datetime 
			= DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		//out.println(now.format(datetime));
		String current_time = now.format(datetime);
		System.out.println(current_time);
	}

}
