package banking.bankarray;

public class AccountTest {

	public static void main(String[] args) {
		// Account 클래스의 배열 객체 생성
		//1개 생성
		Account ac = new Account("1111", "김사원", 10000);
		
		System.out.println("계좌번호: " + ac.getAno());
		System.out.println("계좌주: " + ac.getOwner());
		System.out.println("잔고: " + ac.getBalance());
		
		//Account 계정 10개 생성
		Account[] accountArray = new Account[10];
		
		accountArray[0] = new Account("2222", "이대리", 20000);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null)
				System.out.println(accountArray[i].getAno());
		}
		

	}

}
