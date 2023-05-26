package twodimention;

public class TwoDimention3 {

	public static void main(String[] args) {
		// 문자형 2차원 배열
		char[][] alphabets = new char[13][2];
		char ch ='A';
		
		//알파벳 저장
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				ch = (char) (ch + 1);  //ch = ch + 1
				//ch++;
			}
		}
		
		//알파벳 출력
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				System.out.print(alphabets[i][j] + " " + (int)alphabets[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
