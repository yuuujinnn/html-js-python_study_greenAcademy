package banking_array;

import java.util.Scanner;

public class Main1 {
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

	private static void createAccount() {
		System.out.println("------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("------------------------------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주 : ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		//accountArray[0] = new Account(ano, owner, balance); //계좌 1개 생성
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {  //조건이 없으면 계속 0번 인덱스에 저장됨
				accountArray[i] = new Account(ano, owner, balance); //새 계좌 저장
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	private static void getAccountList() {
		System.out.println("------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("------------------------------------");
		
		/*Account account = accountArray[0];  //출력할 계좌 생성
		System.out.println(account.getAno());
		System.out.println(account.getOwner());
		System.out.println(account.getBalance());*/
		
		for(int i=0; i<accountArray.length; i++) { //전체 배열을 반복하면서
			if(accountArray[i] != null) { //null 오류 처리
				System.out.print("계좌번호: " + accountArray[i].getAno() + "\t");
				System.out.print("계좌주: " + accountArray[i].getOwner() + "\t");
				System.out.println("잔액: " + accountArray[i].getBalance());
			}
		}
	}
	
	private static void deposit() {
		System.out.println("------------------------------------");
		System.out.println("예금");
		System.out.println("------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		if(findAccount(ano) != null) { //찾는 계좌가 있다면
			//예금 = 잔고 + 입금액
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() + money);
			System.out.println("결과 : 정상 처리되었습니다.");
		}else {
			System.out.println("결과 : 계좌가 없습니다.");
		}
	}
	
	private static void withdraw() {
		System.out.println("------------------------------------");
		System.out.println("출금");
		System.out.println("------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		if(findAccount(ano) != null) {
			//예금 = 잔고 - 출금액
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() - money);
			System.out.println("결과 : 정상 처리되었습니다.");
		}else {
			System.out.println("결과 : 계좌가 없습니다.");
		}
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
