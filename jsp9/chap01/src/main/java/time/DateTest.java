package time;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();

        long timeInMilliSeconds = date.getTime();
        System.out.println(timeInMilliSeconds);
        java.sql.Date date1 = new java.sql.Date(timeInMilliSeconds);

        System.out.println("SQL Date: " + date1);

	}

}
