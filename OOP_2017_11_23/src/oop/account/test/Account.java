package oop.account.test;

public class Account {
	//데이터 모델링을 위한 분석은 화면설계를 토대로 항목 분석을 한다.
		//->private 필드로 구성
		//->getter, setter 메소드 추가
		private String accountName;
		private String accountNumber;
		private int balance;
		//명시적 생성자 선언
		public Account(String accountNumber, String accountName, int balance) {
			this.accountNumber = accountNumber;
			this.accountName = accountName;
			this.balance = balance;
		}
		//생성자 오버로딩
		public Account(String accountNumber){
			this.accountNumber = accountNumber;
			this.balance = 10000;
			this.accountName = "홍길동";
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
			return String.format("계좌번호 예금주 예금액%n %s %s %d%n", this.accountNumber, this.accountName, this.balance);
		}
		
}
