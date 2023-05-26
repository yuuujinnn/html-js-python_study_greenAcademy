package datetime;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		
		int month = now.get(Calendar.MONTH) + 1;  
		String strMonth = (month < 10) ? ("0" + month) : ("" + month);
		
		int day = now.get(Calendar.DATE);   
		String strDay = (day < 10) ? ("0" + day) : ("" + day);
		
		System.out.println(year + "년 " + strMonth + "월 " + strDay + "일 ");
	}

}
