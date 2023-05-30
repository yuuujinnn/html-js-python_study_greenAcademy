package classpart;

import hiding.Account;

public class AccountTest {

	public static void main(String[] args) {
		// 계좌 생성
		Account account = new Account("1000-1234", "나상호", 70000);
		
		System.out.println(account.getAno());
		System.out.println(account.getOwner());
		System.out.println(account.getBalance());
	}
}
