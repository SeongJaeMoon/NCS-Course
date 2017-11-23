package oop.account.test;

public class Account {
	//������ �𵨸��� ���� �м��� ȭ�鼳�踦 ���� �׸� �м��� �Ѵ�.
		//->private �ʵ�� ����
		//->getter, setter �޼ҵ� �߰�
		private String accountName;
		private String accountNumber;
		private int balance;
		//����� ������ ����
		public Account(String accountNumber, String accountName, int balance) {
			this.accountNumber = accountNumber;
			this.accountName = accountName;
			this.balance = balance;
		}
		//������ �����ε�
		public Account(String accountNumber){
			this.accountNumber = accountNumber;
			this.balance = 10000;
			this.accountName = "ȫ�浿";
		}
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
		public void setBalanceAdd(int balance) {
			if(balance >=0 && balance <= 1000000) 
				this.balance += balance;
		}
		public void setBalanceSub(int balance) {
			if(balance >=0 && balance <= 1000000)
			this.balance -= balance;
		}
		public int getBalance() {
			return this.balance;
		}
		public String getAccountInfo() {
			return String.format("���¹�ȣ ������ ���ݾ�%n %s %s %d%n", this.accountNumber, this.accountName, this.balance);
		}
		
}
