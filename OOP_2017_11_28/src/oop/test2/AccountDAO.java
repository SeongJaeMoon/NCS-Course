package oop.test2;


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
}
