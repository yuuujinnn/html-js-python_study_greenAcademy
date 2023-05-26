package array;

public class ArrayAlphabet {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		alphabets[0] = ch;
		alphabets[1] = (char)(ch + 1);
		
		System.out.println(alphabets[0]);  // A
		System.out.println(alphabets[1]);  // B
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch = (char) (ch + 1); //ch++도 가능
		}
		
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
	}
}
