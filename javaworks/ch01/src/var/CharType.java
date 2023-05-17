package var;

public class CharType {

	public static void main(String[] args) {
		//문자 자료형
		System.out.println("*** 아스키 ***");
		char ch1 = 'A';
		int ch2 = 66;
		
		System.out.println(ch1);
		System.out.println((int)ch1); // 아스키 코드값 (int) 강제 형변환(캐스트)
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		System.out.println("*** 유니코드 ***");
		char uniCode1 = '가';
		char uniCode2 = '\uac00';
		
		System.out.println(uniCode1);
		System.out.println(uniCode2);
		
		//영어 소문자 전체 출력
		for(char c=97; c<123; c++) {
			System.out.print(c + " ");
		}
		
		
		
		
		
	}

}
