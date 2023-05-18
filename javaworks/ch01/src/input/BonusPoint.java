package input;

import java.util.Scanner;

public class BonusPoint {

	public static void main(String[] args) {
		// 고객의 구매 포인트 계산 프로그램
		// 보너스 포인트 = 구매금액 x 보너스적립율(5%)
		Scanner sc = new Scanner(System.in);
		
		//고객의 이름을 입력받으세요
		System.out.print("고객의 이름을 입력하세요: ");
		String name = sc.nextLine();
		//System.out.println(name);
		
		System.out.print("구매 금액을 입력하세요: ");
		int price = sc.nextInt();  //키보드 입력(숫자)
		int bonusPoint = 0;
		double bonusRatio = 0.05;
		
		//int형 < (int)double형 - 자료형의 크기를 맞춤
		bonusPoint = (int)(price * bonusRatio);
		
		System.out.printf("%s님의 보너스 포인트는 %d점입니다.", name, bonusPoint);
		
		sc.close();

	}

}
