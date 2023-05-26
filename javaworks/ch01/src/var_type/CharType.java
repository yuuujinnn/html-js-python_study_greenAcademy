package var_type;

public class CharType {

	public static void main(String[] args) {
		//문자 자료형
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		char uniCode1 = '가';
		System.out.println(uniCode1);
		
		char uniCode2 = '\uac00';
		System.out.println(uniCode2);
		
		for(char c=97; c<123; c++) {
			System.out.print(c + " ");
		}
	}

}
