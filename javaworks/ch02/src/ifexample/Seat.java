package ifexample;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// 입장객 수에 따른 열과 줄수 계산하기
		Scanner sc = new Scanner(System.in);
		int customer; //입장객 수 저장
		int colNum;   //좌석 열 수 저장
		int rowNum;   //줄(행)의 수 저장
		
		System.out.print("입장객 수 입력 : ");
		customer = sc.nextInt();
		
		System.out.print("좌석 열 수 입력 : ");
		colNum = sc.nextInt();
		
		//연산 처리(조건문) - 나누어 떨어지는 경우, 줄수에 1을 더하는 경우
		if(customer % colNum == 0) {
			rowNum = customer / colNum;  //나누는 몫
		}else {
			rowNum = (int)(customer / colNum) + 1;  //몫 + 1
//			rowNum = customer / colNum + 1;  //몫 + 1
		}
		
//		System.out.println(rowNum + "개의 줄이 필요합니다.");
		System.out.printf("%d개의 줄이 필요합니다.\n", rowNum);
//		System.out.println(customer);
//		System.out.println(colNum);
		
		sc.close();
	}
}
