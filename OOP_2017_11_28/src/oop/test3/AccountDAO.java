package oop.test3;

public class AccountDAO {
	
		//(배열) 저장소 준비
		private Account[] accountArray = new Account[5];
		//인덱스 관리용 전용 변수 준비
		private int idx;
		
		
		//계좌생성하기 메소드
		public void createAccount(String ano, String owner, int balance) {
			//계좌 생성(Account 객체 생성) 및 (배열)저장소에 저장
			//계좌 객체 생성 및 (배열)저장소 저장
			Account ac = new Account(ano, owner, balance);
			accountArray[idx] = ac;
			++idx;
		}
		public void deposit(String ano, int balance) {
			Account account = findAccount(ano);
			account.setBalance(account.getBalance()+balance);
		}
		public void withdraw(String ano, int balance) {
			Account account = findAccount(ano);
			account.setBalance(account.getBalance()-balance);
		}
		public Account findAccount(String ano) {
			Account account = null;
			for(Account temp : this.accountArray) {
				if(temp==null)continue;
				if (temp.getAno().equals(ano)) {
					account = temp;
				}
			}
			return account;
		}
		public String accountList() {
			StringBuilder str = new StringBuilder();
			for (Account temp : this.accountArray) {
				if (temp == null) continue;
				str.append(temp.getAccountInfo());
			}
			return str.toString();
		}	
}
