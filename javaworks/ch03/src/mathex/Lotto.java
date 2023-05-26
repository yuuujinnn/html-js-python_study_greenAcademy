package mathex;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];  //로또 배열 생성
		
		for(int i=0; i<lotto.length; i++) { //로또번호 추첨
			lotto[i] = (int)(Math.random()*45) + 1; 
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) { //이전 번호와 일치하면
					i--;     //이전 인덱스로 이동       
				}
			}
		}
		/*
		 * 29 24 31 31(중복) 15 16
		 *  i=0 lotto[0]==lotto[0] false 29
		 *  i=1 lotto[1]==lotto[0] false 29 24
		 *  i=2 lotto[2]==lotto[1] false 29 24 31
		 *  i=3 lotto[3]==lotto[2] true  29 24 31 31 (중북)
		 *  i=3 lotto[3]==lotto[2] false 29 24 31 26 (재할당)
		 */
		for(int i=0; i<lotto.length; i++) { //로또 번호 출력
			System.out.print(lotto[i] + " ");
		}
	}
}
