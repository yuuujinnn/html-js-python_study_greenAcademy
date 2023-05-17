package var;

public class Variable {

	public static void main(String[] args) {
		//변수 선언과 사용
		int grade;   //정수형 변수 grade 선언
		grade = 3;   //grade 3을 기억
		
		String name = "한지수";  //문자형 변수 String에 "한지수"를 기억
		
		int schoolClass = 2;  //예약어(이미 사용되는 키워드)는 변수로 만들수 없음
		
		System.out.println(grade + "학년 " + schoolClass + "반 " + name);
	}

}
