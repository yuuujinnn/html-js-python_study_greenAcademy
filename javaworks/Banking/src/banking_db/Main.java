package banking_db;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------------------------------------");
		    System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌검색 | 6.계좌삭제 | 7.종료");
		    System.out.println("------------------------------------------------------------------");
		    System.out.print("선택> ");
		    
		    String selectNo = scanner.next();
		    if(selectNo.equals("1")) {
		    	dao.createAccount();
		    }
		    else if(selectNo.equals("2")){
		    	dao.getAccountList();
		    }
		    else if(selectNo.equals("3")) {
		    	dao.deposit();
		    }
		    else if(selectNo.equals("4")) {
		    	dao.withdraw();
		    }
		    else if(selectNo.equals("5")){
		    	dao.viewAccount();
		    }
		    else if(selectNo.equals("6")){
		    	dao.deleteAccount();
		    }
		    else if(selectNo.equals("7")){
		    	run = false;
		    }
		    else{
		    	System.out.println("지원되지 않는 기능입니다.");
		    }
		}
		System.out.println("프로그램 종료!!");
		scanner.close();
	}
}
