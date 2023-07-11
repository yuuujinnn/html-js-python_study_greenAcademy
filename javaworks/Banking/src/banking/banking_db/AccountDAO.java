package banking.banking_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import banking.banking_db.common.JDBCUtil;

public class AccountDAO {
	//전역 변수
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	Scanner scanner = new Scanner(System.in);
	
	//계좌를 생성하는 함수
	public void createAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌 생성에 필요한 정보를 입력하세요");
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
				
				conn = JDBCUtil.getConnection();
				String sql = "INSERT INTO account(ano, owner, balance) VALUES (?, ?, ?)";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, ano);
					pstmt.setString(2, owner);
					pstmt.setInt(3, balance);
					pstmt.executeUpdate();  //db에 계좌 저장
					System.out.println("결과: 계좌가 생성되었습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				break; //정상적으로 계좌 생성 빠져 나옴
			} //if ~else 끝
		} //내부 while 끝
	}
	
	//계좌 목록을 출력하는 메서드
	public void getAccountList() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌 목록입니다.");
		System.out.println("-------------------------------------------");
		
		ArrayList<Account> accountList = new ArrayList<>();	
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) { //자료가 있으면 계속 반복
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				Account account = new Account(ano, owner, balance);
				accountList.add(account);
			}
			//화면에 출력
			for(int i=0; i<accountList.size(); i++) {
				Account account = accountList.get(i); //자료를 가져와서 저장
				
				System.out.print("계좌번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔액: " + account.getBalance());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
	}
	
	//계좌에 입금하는 메서드
	public void deposit() {
		System.out.println("-------------------------------------------");
		System.out.println("입금할 계좌 정보를 입력해주세요");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //찾는 계좌가 있다면
				System.out.print("입금액:  "); //입금함
				int money = Integer.parseInt(scanner.nextLine());
				
				Account account = findAccount(ano); //입력한 계좌를 가져옴
				String owner = account.getOwner();
				int balance = account.getBalance() + money; //예금 = 잔고 + 예금액
				
				conn = JDBCUtil.getConnection();
				String sql = "UPDATE account SET owner = ?, balance = ?  WHERE ano = ?";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, owner);
					pstmt.setInt(2, balance);
					pstmt.setString(3, ano);
					pstmt.executeUpdate();  //db에 저장
					System.out.printf("%,d원 정상 입금되었습니다.\n", money);
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				break; //입금 처리후 빠져나옴
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}
	}
	
	//계좌에서 출금하는 메서드
	public void withdraw() {
		System.out.println("-------------------------------------------");
		System.out.println("출금할 계좌 정보를 입력해주세요");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //계좌를 찾았다면(반환값이 있다면)
				while(true) {
					System.out.print("출금액:  ");
					int money = Integer.parseInt(scanner.nextLine());
					Account account = findAccount(ano); //입력한 계좌를 가져옴
					String owner = account.getOwner();
					int balance = account.getBalance() - money; //예금 = 잔고 - 출금액
					
					if(money > account.getBalance()) { //출금액이 잔고를 초과한다면
						System.out.println("잔액이 부족합니다. 다시 입력해 주세요");
					}else {
						conn = JDBCUtil.getConnection();
						String sql = "UPDATE account SET owner = ?, balance = ?  WHERE ano = ?";
						try {
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, owner);
							pstmt.setInt(2, balance);
							pstmt.setString(3, ano);
							pstmt.executeUpdate();  //db에 저장
							System.out.printf("%,d원 정상 출금되었습니다.\n", money);
						} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							JDBCUtil.close(conn, pstmt);
						}
						break;  //출금 처리후 빠져나옴
					}
				}//내부 while 끝
				break; //정상 처리후 빠져나옴
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//외부 while 끝
	}
	
	//계좌 삭제
	public void deleteAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("삭제할 계좌를 입력하세요");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //찾는 계좌가 있다면
				conn = JDBCUtil.getConnection();
				String sql = "DELETE FROM account WHERE ano = ?";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, ano);
					pstmt.executeUpdate();  //db에 저장
					System.out.println("결과: 계좌를 삭제했습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				break; //입금 처리후 빠져나옴
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}
	}
	
	//계좌를 검색하는 메서드(계좌 1개 가져오기)
	public Account findAccount(String ano) {
		Account account = null;  //빈 계좌 계정을 할당
		
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account WHERE ano = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return account;  //account 1개 반환
	}
}//DAO 클래스 끝
