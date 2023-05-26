package whileif;

import java.util.Scanner;

public class Bank3 {
	public static void main(String[] args) {
		/*
		 * 은행 업무 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		boolean run = true;  //상태(실행) 변수
		int balance = 0;     //잔고
		int money = 0; //입, 출금액
		
		while(run) {
			//화면 만들기(ui)
			try {
				System.out.println("=============================");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("=============================");
				System.out.print("선택>");
				
				int selNum = Integer.parseInt(sc.nextLine());
				switch(selNum) {
				case 1:
					while(true) {
						System.out.print("예금액>");
						//money = sc.nextInt();  //money 변수 사용가능
						money =  Integer.parseInt(sc.nextLine());
						if(money < 0) {
							System.out.println("음수를 입력할 수 없습니다. 다시 입력하세요");
						}else {
							balance += money;
							System.out.printf("%,d원 정상처리 되었습니다.\n", money);
							break;
						}
					}
					break;
				case 2:
					while(true) {
						System.out.print("출금액>");
						money =  Integer.parseInt(sc.nextLine());
						if(money > balance) {
							System.out.println("잔액이 부족합니다. 다시 입력하세요");
						}else if(money < 0) {
							System.out.println("음수를 입력할 수 없습니다. 다시 입력하세요");
						}
						else {
							balance -= money;
							System.out.printf("%,d원 정상처리 되었습니다.\n", money);
							break;
						}
					}
					break;
				case 3:
					System.out.printf("잔액>%,d원\n", balance);
					break;
				case 4:
					run = false;  //while 벗어남
					break;
				default:
					System.out.println("지원하지 않는 기능입니다. 다시 선택하세요");
					break;
				}//switch 닫기
			}catch(Exception e) {
				System.out.println("올바른 선택이 아닙니다. 다시 선택하세요.");
			}
		}//while 닫기
		System.out.println("프로그램 종료");
		sc.close();
	}
}
