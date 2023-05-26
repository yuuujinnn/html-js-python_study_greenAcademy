package arraylist;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// 정수를 저장할 어레이리스트 생성
		// Wrapper 클래스-Integer 클래스 - 기본 자료형인 int를 객체화한 클래스임
		ArrayList<Integer> numberList = new ArrayList<>();
		
		//요소 저장
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(5);
		
		//요소의 합계
		int sumV = 0;
		double avg;
		
		for(int i=0; i<numberList.size(); i++) {
		  sumV += numberList.get(i);
		}
		avg = (double)sumV / numberList.size(); //평균=총점/개수
		
		System.out.println("합계: " + sumV);
		System.out.println("평균: " + avg);

	}

}
