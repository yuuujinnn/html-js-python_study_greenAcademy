package whileif;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("입장객 수 입력: ");
		int customer = sc.nextInt();
		
		System.out.print("좌석 열 수 입력: ");
		int colNum = sc.nextInt();
		int rowNum;
		
		if(customer % colNum == 0) {
			rowNum = customer / colNum;
		}else {
			rowNum = (int)(customer / colNum) + 1;
		}
		//System.out.println(rowNum);
		
		for(int i=0; i<rowNum; i++) {
			for(int j=1; j<=colNum; j++) {
				int num = 5*i+j;
				if(num > customer)
					break;
				System.out.print("좌석" + num + " ");
			}
			System.out.println();
		}

	}

}
