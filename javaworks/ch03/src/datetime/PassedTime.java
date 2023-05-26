package datetime;

import java.util.Calendar;

public class PassedTime {

	public static void main(String[] args) {
		Calendar theDay = Calendar.getInstance();  //시작일 객체 생성
		Calendar today = Calendar.getInstance();   //오늘 객체 생성
		
		//System.out.println(today);
		//System.out.println(today.get(Calendar.YEAR)); 
		//System.out.println(today.get(Calendar.MONTH) + 1);
		
		//System.out.println(today.getTimeInMillis());
		//년으로 환산
		//System.out.println(today.getTimeInMillis() / (24*60*60*1000)/ 365);
		//일로 환산
		//System.out.println(today.getTimeInMillis() / (24*60*60*1000));
		
		//시작일과 종료일 지정
		theDay.set(2023, 3, 16);  //시작일 지정
		today.set(2023, 5, 24);   //종료일 지정
		
		//날짜 출력
		/*String startDay = theDay.get(Calendar.YEAR) + "년 " +
			theDay.get(Calendar.MONTH) + "월 " + theDay.get(Calendar.DATE) + "일";
		String today1 = today.get(Calendar.YEAR) + "년 " +
				today.get(Calendar.MONTH) + "월 " + today.get(Calendar.DATE) + "일";
		System.out.println(startDay);
		System.out.println(today1);*/
		
		//날짜 출력 메서드 호출
		System.out.println(datePrint(theDay)); //시작일 출력
		System.out.println(datePrint(today));  //종료일 출력
		
		//지나온 시간 계산 : 종료일 - 시작일
		long passedTime = today.getTimeInMillis() - theDay.getTimeInMillis();
		System.out.println(passedTime + "밀리초");
		//일로 환산
		passedTime = passedTime/(24*60*60*1000);
		System.out.println("개강 이후 " + passedTime + "일이 지났습니다.");
	}//main 끝
	
	//날짜 출력 메서드
	public static String datePrint(Calendar date) { //날짜 객체를 매개로 전달받아
		String strDate = date.get(Calendar.YEAR) + "년 " +
				date.get(Calendar.MONTH) + "월 " + date.get(Calendar.DATE) + "일";
		return strDate;  //날짜 문자열을 반환(돌려줌)
	}
}
