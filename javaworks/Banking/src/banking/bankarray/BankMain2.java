package banking.bankarray;

import java.util.Scanner;

public class BankMain2 {
	// 통장 계좌를 만들 객체 배열 100개 생성
	static Account[] accountArray = new Account[100];  //전역에 위치(배열)
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			//메뉴 선택 변수
			int selectNo = Integer.parseInt(scanner.nextLine()); //문자형을 숫자형으로 변환
			
			if(selectNo == 1) {
				createAccount();  //계좌 생성
			}else if(selectNo == 2) {
			    getAccountList(); //계좌 목록
			}else if(selectNo == 3) {
			    deposit();        //예금
			}else if(selectNo == 4) {
			    withdraw();        //출금
			}else if(selectNo == 5) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요");
			}
		}//while() 끝
		
	}//main() 끝
	

	//계좌를 생성하는 함수
	private static void createAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			//중복 계좌 오류 해결
			if(findAccount(ano) != null) { //계좌 계정이 이미 있다면(계좌번호 중복)
				System.out.println("중복 계좌입니다. 다시 입력해 주세요");
			}else {
				System.out.print("계좌주:  ");
				String owner = scanner.nextLine();
				
				System.out.print("초기입금액:  ");
				int balance = Integer.parseInt(scanner.nextLine());
				for(int i=0; i<accountArray.length; i++) {//전체 배열을 반복하면서
					//0번 인덱스에 새 계좌가 저장되는 문제
					if(accountArray[i] == null) { //계좌가 저장되지 않는 인덱스에 
						accountArray[i] = new Account(ano, owner, balance); //계좌를 생성함
						System.out.println("결과: 계좌가 생성되었습니다.");
						break; //계좌 생성후 빠져나옴
					}
				}
				break; //정상적으로 계좌 생성 빠져 나옴
			} //if ~else 끝
		} //내부 while 끝
	}
	
	//계좌 목록을 출력하는 메서드
	private static void getAccountList() {
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {  //배열의 요소가 null이 아닌 경우(계좌가 있음)
				System.out.print("계좌번호: " + accountArray[i].getAno() + "\t");
				System.out.print("계좌주: " + accountArray[i].getOwner() + "\t");
				System.out.println("잔액: " + accountArray[i].getBalance());
			}
		}
	}
	
	//계좌에 입금하는 메서드
	private static void deposit() {
		System.out.println("-------------------------------------------");
		System.out.println("예금");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //찾는 계좌가 있다면
				System.out.print("입금액:  "); //입금함
				int money = Integer.parseInt(scanner.nextLine());
				
				Account account = findAccount(ano);
				//예금 = 잔고 + 예금액
				account.setBalance(account.getBalance() + money);
				System.out.println("결과: 정상 처리 되었습니다.");
				break; //입금 처리후 빠져나옴
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}
	}
	
	//계좌에서 출금하는 메서드
	private static void withdraw() {
		System.out.println("-------------------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //계좌를 찾았다면(반환값이 있다면)
				while(true) {
					System.out.print("출금액:  ");
					int money = Integer.parseInt(scanner.nextLine());
					
					Account account = findAccount(ano);
					if(money > account.getBalance()) { //출금액이 잔고를 초과한다면
						System.out.println("잔액이 부족합니다. 다시 입력해 주세요");
					}else {
						//출금 = 잔고 - 예금액
						account.setBalance(account.getBalance() - money);
						System.out.println("결과: 정상 처리 되었습니다.");
						break;  //출금 처리후 빠져나옴
					}
				}//내부 while 끝
				break; //정상 처리후 빠져나옴
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//외부 while 끝
	}
	
	// 계좌를 검색하는 메서드
	private static Account findAccount(String ano) {
		Account account = null;  //빈 계좌 계정을 할당
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) { //없는 계좌를 입력하면 null 예외 발생
				String dbAno = accountArray[i].getAno();  //이미 저장된 계정
				if(dbAno.equals(ano)) { //찾는 계좌와 일치하면..문자열 비교 - equals() 사용
					account = accountArray[i]; //계좌를 가져와 저장
					break;  //빠져나옴
				}
			}
		}
		return account;
	}
	
}//Main 클래스 끝
