package bean;

public class GuguBean {
	//구구단 곱셈 결과
	public int[] times(int dan) {
		int[] gugu = new int[9];  //곱셈 결과 저장 배열 선언
		for(int i=1; i<10; i++) {
			gugu[i-1] = dan * i; //곱한 값을 배열에 저장
		}
		return gugu;  //배열을 반환함
	}
}
