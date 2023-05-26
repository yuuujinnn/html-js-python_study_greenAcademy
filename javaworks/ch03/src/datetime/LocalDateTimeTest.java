package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		LocalTime time = LocalTime.now();
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(now);
		
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yy-mm-dd hh:mm:ss a");
		System.out.println(now.format(datetime));
	}

}
