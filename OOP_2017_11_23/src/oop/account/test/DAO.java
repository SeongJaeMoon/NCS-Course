package oop.account.test;

import java.util.Arrays;

	public class DAO {

		private Account[] accountArray = new Account[5]; //��ü�� ���� �迭 ����
		private int count = 0; //�迭�� �Ҵ��� ��ġ�� �����ϱ� ���� ���� ����
		

		public void accountAdd(Account a) {
			if (accountArray.length == count) //�迭�� ũ��� ī��Ʈ�� �������ٸ�
				this.accountArray = Arrays.copyOf(this.accountArray, this.accountArray.length+5);//�迭 ���� �� �迭 ũ�� ����
			this.accountArray[this.count] = a; //�迭�� ��ü ����
			++this.count;//���� �迭�� �߰��ϱ� ���� ��ġ�� ����
		}
		
		
		public Account accountFindOut(String accountNumber){
			Account account = null; //��ü�� ��ȯ�� ���� ����
			for(Account a : accountArray) { //�迭�� ũ�� ��ŭ ã��
				if(a==null)continue; //��ü�� null�̸� 
				if(a.getAccountNumber().equals(accountNumber)) //��ü�� ����� ���¹�ȣ�� �Է¹��� ���� ���ٸ�
					account = a; //������ �ش� ��ü �Ҵ�
			}
			return account;//��ü ����
		}

		public Account[] accountList() {
			return this.accountArray; //�迭 ����
		}
 
}
