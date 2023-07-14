package time;

import java.sql.Timestamp;

public class DateTest2 {

	public static void main(String[] args) {
		Timestamp date = new Timestamp(System.currentTimeMillis()); // 현재 날짜 출력
		System.out.println(date);
	}

}
