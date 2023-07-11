package banking.bankarray;

public class Account {
	private String ano;    //계좌 번호
	private String owner;  //계좌주
	private int balance;   //잔고
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	
	public String getOwner() {
		return owner;
	}
	
	//잔고를 저장하는 메서드
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
}
