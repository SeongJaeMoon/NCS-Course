package oop.test3;

public class AccountDAO {
	
		//(�迭) ����� �غ�
		private Account[] accountArray = new Account[5];
		//�ε��� ������ ���� ���� �غ�
		private int idx;
		
		
		//���»����ϱ� �޼ҵ�
		public void createAccount(String ano, String owner, int balance) {
			//���� ����(Account ��ü ����) �� (�迭)����ҿ� ����
			//���� ��ü ���� �� (�迭)����� ����
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
