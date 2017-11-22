package oop.test2;

public class Account {
	
	//데이터 모델링을 위한 분석은 화면설계를 토대로 항목 분석을 한다.
	//->private 필드로 구성
	//->getter, setter 메소드 추가
	private String accountName;
	private String accountNumber;
	private int balance;
	
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public void setBalance(int balance) {
		if(balance >=0 && balance <= 1000000) {
			this.balance = balance;
		}
	}
	public int getBalance() {
		return this.balance;
	}
	public String getAccountInfo() {
		return String.format("%s %s %d", this.accountNumber, this.accountName, this.balance);
	}
	
}
