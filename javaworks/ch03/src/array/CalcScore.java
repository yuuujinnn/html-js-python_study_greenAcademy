package array;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		// 학생 성적 처리
		boolean run = true;
		int studentNum = 0;  //학생수
		int[] scores = null;  //점수 배열
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			try {
				System.out.println("==============================================");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("==============================================");
				System.out.print("선택 >");
				
				int selectNo = Integer.parseInt(scan.nextLine());
				
				if(selectNo == 1) {
					System.out.print("학생수 >");
					studentNum = Integer.parseInt(scan.nextLine());
					scores = new int[studentNum];
				}else if(selectNo == 2) {
					System.out.println("점수입력> ");
					for(int i=0; i<scores.length; i++) {
						System.out.print("scores[" + i + "]>");
						scores[i] = Integer.parseInt(scan.nextLine());
					}
				}else if(selectNo == 3) {
					for(int i=0; i<scores.length; i++) {
						System.out.println("scores[" + i + "]>" + scores[i]);
					}
				}else if(selectNo == 4) {
					//최고점수, 합계, 평균
					int sumV = 0;
					double avg;
					int maxV = scores[0];
					
					for(int i=0; i<scores.length; i++) {
						sumV += scores[i]; //합계
						
						/*if(maxV < scores[i]) { //비교
							maxV = scores[i];
						}*/
						maxV = (maxV < scores[i]) ? scores[i] : maxV;
					}
					avg = (double)sumV / scores.length;
					
					System.out.println("합계 : " + sumV);
					System.out.println("평균 : " + avg);
					System.out.println("최고점수 : " + maxV);
				}else if(selectNo == 5){
					run = false;
					System.out.println("프로그램을 종료합니다.");
				}else {
					System.out.println("지원되지 않는 기능입니다. 다시 선택하세요");
				}
			}catch(Exception e) {
				System.out.println("올바른 선택이 아닙니다. 다시 선택하세요");
			}
		}//while() 끝
		scan.close();
	}

}
