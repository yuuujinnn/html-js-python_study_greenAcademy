package hello;

public class HelloJava {

	public static void main(String[] args) {
		// println() -줄바꿈되며 출력
		/*
		 * 여러 줄 주석
		 * 작성자 : 김그린
		 * 자료형 - 숫자, 문자, 불리언, 배열
		 */
		System.out.println("Hello~ Java!");
		System.out.println(2.54);
		System.out.println(10 > -10);	// 블리언(boolean) - true
		System.out.println(10+11);
		// 한 문자는 홑따옴표 사용, 여러 문자는 쌍따옴표 사용, 아스키 코드 1 - 49, 10+49=59
		System.out.println(10 + '1');
		System.out.println(10 + "1");	// 큰 자료형 쪽으로 자동형 변환
	}	// main() 닫기

}	//class 닫기 - 클래스 이름은 첫문자를 대문자로 씀
