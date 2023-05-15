package var;

public class StringType {

	public static void main(String[] args) {
		// 문자열 자료형
		// 기본 자료형 - int, double, char
		// 참조 자료형 - String, Integer
		char ch = 'k';
		String str = "k";
		
		String name = "ja" + "va";
		String str2 = name + 11.0;  //숫자와 문자를 연결할 수 있음
		
		System.out.println(ch);
		System.out.println(str);
		System.out.println(name);
		System.out.println(str2);
	}

}
