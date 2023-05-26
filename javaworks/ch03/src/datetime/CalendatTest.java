package datetime;

import java.util.Calendar;

public class CalendatTest {

	public static void main(String[] args) {
		//날짜와 시간 객체 생성
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getCalendarType());
		
		//날짜
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;  //배열 인덱스 0 - 1월
		int date = cal.get(Calendar.DATE);
		
		//시간
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		//요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + "년 " + month + "월 " + date + "일 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초 ");
		System.out.println(day); // 1-일, 2-월, 3-화...
		
		//요일 출력
		String[] days = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 " + days[day-1] + "요일입니다.");
	}
}
