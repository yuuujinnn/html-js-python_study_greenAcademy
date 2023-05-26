package arrays;

public class ArrayAlphabet {

	public static void main(String[] args) {
		// 1부터 10까지 저장하는 배열
		// numbers 배열, 객체-> 힙 메모리
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			//System.out.print(numbers[i] + " ");
		}
		
		//알파벳 대문자 - 저장(26개)
		char[] alphabets = new char[26];
		char ch = 'A';
		
		/*alphabets[0] = ch;
		alphabets[1] = (char) (ch + 1);  //char형으로 강제 형변환
		
		System.out.print(alphabets[0]);
		System.out.print(alphabets[1]);*/
		
		//알파벳 26자 저장
		for(int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch;
			//ch = (char) (ch + 1); //문자를 1개 증가
			ch++;
		}
		
		for(int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
	}

}
