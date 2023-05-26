package whileif;

import java.util.Scanner;

public class Bank2 {

	public static void main(String[] args) {
		// 은행 업무
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		int money;
		
		while(run) {
			try {
				System.out.println("=======================");
				System.out.println("1.예금 2.출금 3.잔고 4.종료");
				System.out.println("=======================");
				System.out.print("선택> ");
				
				int selNum = Integer.parseInt(sc.nextLine());
				
				switch(selNum) {
				case 1:
					System.out.print("예금액> ");
					money = Integer.parseInt(sc.nextLine());
					balance += money;
					System.out.printf("%,d원 정상 처리되었습니다.\n", money);
					break;
				case 2:
					System.out.print("출금액> ");
					money = Integer.parseInt(sc.nextLine());
					if(money > balance) {
						System.out.println("잔액이 부족합니다.");
						break;
					}else {
						balance -= money;
						System.out.printf("%,d원 정상 처리되었습니다.\n", money);
						break;
					}
				case 3:
					System.out.println("잔고> " + balance);
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("메뉴를 잘못 누르셨습니다. 다시 입력해주세요" );
					break;
				}
			}catch(Exception e) {
				System.out.println("숫자를 입력해주세요");
			}
		}//while 닫기
		System.out.println("프로그램을 종료합니다!");
		sc.close();
	}

}
