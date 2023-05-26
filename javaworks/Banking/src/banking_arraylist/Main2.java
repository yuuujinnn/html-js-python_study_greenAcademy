   package banking_arraylist;

import java.util.Scanner;

public class Main2 {
	//계좌 100개를 만들 배열 생성
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true; //실행, 종료 상태 변수
		
		while(run) {
			try {
				System.out.println("-------------------------------------------");
			    System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			    System.out.println("-------------------------------------------");
			    System.out.print("선택> ");
			    
			    //메뉴 선택 변수
			    int selectNo = Integer.parseInt(scanner.nextLine()); 
			    
			    if(selectNo==1) {
			    	createAccount();  //계좌 생성 호출
			    }else if(selectNo==2){
			    	getAccountList(); //계좌 목록
			    }else if(selectNo==3) {
			    	deposit();        //입금
			    }else if(selectNo==4) {
			    	withdraw();       //출금
			    }else if(selectNo==5){
			    	run = false;      //상태 변수 변경
			    	System.out.println("프로그램을 종료합니다!");
			    }else {
			    	System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요");
			    }
			}catch(Exception e) { //예외 처리 구문
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
		}
		scanner.close();
	}

	//계좌 중복 및 기본 입금액 입력 처리
	private static void createAccount() {
		System.out.println("------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("------------------------------------");
		
		while(true) {
			System.out.print("계좌번호 : ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				System.out.println("중복 계좌입니다. 다시 입력해 주세요");
			}else {
				System.out.print("계좌주 : ");
				String owner = scanner.nextLine();
				
				while(true) {
					System.out.print("초기입금액 : ");
					int balance = Integer.parseInt(scanner.nextLine());
					
					if(balance < 100) {
						System.out.println("기본 입금액은 100원 이상입니다. 다시 입력해 주세요");
					}else {
						for(int i=0; i<accountArray.length; i++) {
							if(accountArray[i] == null) {  //조건이 없으면 계속 0번 인덱스에 저장됨
								accountArray[i] = new Account(ano, owner, balance); //새 계좌 저장
								System.out.println("결과: 계좌가 생성되었습니다.");
								break;
							}
						}
						break;
					}
				}//계좌주 while() 끝
				break;
			}
		}// 계좌번호 while() 끝
	}
	
	private static void getAccountList() {
		System.out.println("------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("------------------------------------");
		
		for(int i=0; i<accountArray.length; i++) { //전체 배열을 반복하면서
			Account account = accountArray[i];  //출력할 계좌 생성
			if(account != null) { //null 오류 처리
				System.out.print("계좌번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔액: " + account.getBalance());
			}
		}
	}
	
	private static void deposit() {
		System.out.println("------------------------------------");
		System.out.println("예금");
		System.out.println("------------------------------------");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //찾는 계좌가 있다면
				System.out.print("예금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				//예금 = 잔고 + 입금액
				Account account = findAccount(ano);
				account.setBalance(account.getBalance() + money);
				System.out.println("결과 : 정상 처리되었습니다.");
				break;
			}else {
				System.out.println("결과 : 계좌가 없습니다. 다시 입력해 주세요");
			}
		}
	}
	
	//출금시 잔액 부족 오류 해결
	private static void withdraw() {
		System.out.println("------------------------------------");
		System.out.println("출금");
		System.out.println("------------------------------------");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				while(true) {
					System.out.print("출금액: ");
					int money = Integer.parseInt(scanner.nextLine());
					
					//예금 = 잔고 - 출금액
					Account account = findAccount(ano);
					if(money > account.getBalance()) {
						System.out.println("잔액이 부족합니다. 다시 입력해 주세요.");
					}else {
						account.setBalance(account.getBalance() - money);
						System.out.println("결과 : 정상 처리되었습니다.");
						break;
					}
				}//안쪽 while() 끝
				break;
			}else {
				System.out.println("결과 : 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//바깥 while() 끝
	}
	
	private static Account findAccount(String ano) {
		Account account = null;  //찾을 계좌 저장할 객체 생성
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) { //null 오류 처리
				String dbAno = accountArray[i].getAno(); //이미 배열에 저장된 계좌가
				if(dbAno.equals(ano)) { //찾는 계좌와 일치하면
					account = accountArray[i];  //계좌를 가져옴
					break;
				}
			}
		}
		return account;  //계좌를 호출한 곳으로 돌려줌		
	}
}
