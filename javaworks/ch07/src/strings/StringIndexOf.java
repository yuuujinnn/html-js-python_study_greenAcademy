package strings;

public class StringIndexOf {

	public static void main(String[] args) {
		//indexOf() - 찾는 문자의 첫 위치(숫자)가 반환됨(리턴)
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("자바");
		System.out.println(location);
		
		if(location != -1) { //못찾으면 -1을 반환, location >= 0
			System.out.println("자바와 관련된 책이군요!");
		}else {
			System.out.println("자바와 관련이 없는 책이군요!");
		}
		
		//lastIndexOf() - 찾는 문자를 뒤에서 부터 검색함(숫자로 반환함)
		String uri = "/board/boardList.jsp";
		int uri_idx1 = uri.indexOf('/');
	
		System.out.println(uri_idx1);  //앞에 있는 '/'
		
		int uri_idx2 = uri.lastIndexOf('/');
		System.out.println(uri_idx2);  //뒤에 있는 '/'
	}

}
