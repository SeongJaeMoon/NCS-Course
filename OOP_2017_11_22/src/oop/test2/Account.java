package oop.test2;

public class Account {
	
	//������ �𵨸��� ���� �м��� ȭ�鼳�踦 ���� �׸� �м��� �Ѵ�.
	//->private �ʵ�� ����
	//->getter, setter �޼ҵ� �߰�
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
