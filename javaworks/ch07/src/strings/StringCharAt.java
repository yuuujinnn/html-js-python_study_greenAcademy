package strings;

public class StringCharAt {

	public static void main(String[] args) {
		//문자열 함수 - charAt(인덱스) : 그 위치의 문자 반환(리턴)
		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(4);
		System.out.println(charValue);
		
		//주민번호에서 남여 구분
		String ssn = "940815-4234567";
		char gender = ssn.charAt(7); //'1'
		switch(gender) {
		case '1' : case '3':
			System.out.println("남자입니다."); break;
		case '2':
		case '4':
			System.out.println("여자입니다."); break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
		}
	}

}
