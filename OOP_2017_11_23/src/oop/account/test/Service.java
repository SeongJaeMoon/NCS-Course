package oop.account.test;

public class Service {

	private DAO dao = new DAO();//DAO ��ü ����
	private Account account = new Account("1111", "ȫ�浿", 10000); //Account ��ü ����
	
	public void accountAdd(){//���α׷� ���۽� �ʱ�ȭ ������ �޼ҵ� 
		this.dao.accountAdd(this.account);
	}
	
	public void accountAdd(String accountNumber) { //���¹�ȣ �߰� �޼ҵ� 
		if(this.dao.accountFindOut(accountNumber)!=null) {//�̹� ������ ���¹�ȣ���
			System.out.println("�̹� ������ ���¹�ȣ �Դϴ�.");
		}else {
		this.account = new Account(accountNumber); //���ο� ���°�ü ����
		this.dao.accountAdd(this.account);//���¹�ȣ �߰�
		System.out.printf("���� %s�� �߰��Ǿ����ϴ�.%n", accountNumber);
		}
	}
	
	public boolean isFindAccount(String accountNumber){//���¹�ȣ ���� ���� Ȯ�ο� �޼ҵ�
		boolean isTrue = false; //��, ���� ��Ȳ�� ���� ����
		if(this.dao.accountFindOut(accountNumber)!=null)//�̹� �����ϴ� ���¹�ȣ�̶��
			isTrue = true; //�� �� �Ҵ�
		return isTrue; //�� ���� �Ǵܿ� �� ����
	}
	
	public void accountAdd(int balance) { //�Աݿ� �޼ҵ�
		account.setBalanceAdd(balance);
		System.out.println(account.getAccountInfo());
		
	}
	public void accountSub(int balance) { //��ݿ� �޼ҵ�
		account.setBalanceSub(balance);
		System.out.println(account.getAccountInfo());
	}
	
	public void accountList() { //��ü ���¸�� ��¿� �޼ҵ�
		System.out.println("-------");
		System.out.println("��������");
		System.out.println("-------");
		for(Account a : this.dao.accountList()) {
			if(a==null)continue;
			System.out.println(a.getAccountInfo());
		}	
	}
}
