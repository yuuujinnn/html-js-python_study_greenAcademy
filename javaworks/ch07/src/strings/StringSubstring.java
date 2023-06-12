package strings;

public class StringSubstring {

	public static void main(String[] args) {
		
		//substring(인수1, 인수2) - 인수1에서 인수2(값-1)까지 문자 추출
		String ssn = "940608-2345678";
		
		String firstPart = ssn.substring(0, 6);
		System.out.println(firstPart);
		
		//substring(인수1) - 인수1부터 끝까지 문자 추출
		String secondPart = ssn.substring(7);
		System.out.println(secondPart);
		
		//url 경로 추출
		String uri = "/board/boardList.jsp";
		int uri_idx = uri.lastIndexOf('/');  //6
		
		System.out.println(uri.substring(uri_idx));
	}

}
