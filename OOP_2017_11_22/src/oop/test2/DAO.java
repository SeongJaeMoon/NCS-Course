package oop.test2;

import java.util.Arrays;

//(�迭)����� ���� Ŭ����
public class DAO {

	private Account[] accountArray = new Account[5];
	private int count = 0;
	// �Ű������� ���ؼ� ���޵Ǵ� ���� ��ü�� ����ҿ� �����ϴ� �޼ҵ�
	// instance �޼ҵ�

	public void accountAdd(Account a) {
		// �� �� �̻��� ��ü ������ ���ؼ� �ε��� ���� �ʿ�
		// ����� ������ �ڵ� ���� ���α׷�
		if (accountArray.length == count)
			this.accountArray = Arrays.copyOf(this.accountArray, this.accountArray.length+5);

		this.accountArray[this.count] = a;
		++this.count;

	}

	public Account[] accountList() {
		return this.accountArray;
	}
}
